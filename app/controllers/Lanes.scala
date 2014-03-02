package controllers

import scala.concurrent.ExecutionContext.Implicits.global

import models.Lane
import models.Lane.laneFormat
import models.Lane.LaneBSONReader
import models.Lane.LaneBSONWriter
import models.Task
import models.Task.taskFormat
import models.Task.TaskBSONReader
import models.Task.TaskBSONWriter
import play.api.libs.json.Json
import play.api.mvc.Action
import play.api.mvc.Controller
import play.modules.reactivemongo.MongoController
import reactivemongo.api.collections.default.BSONCollection
import reactivemongo.bson.BSONDocument
import reactivemongo.bson.BSONDocumentIdentity
import reactivemongo.bson.BSONObjectID
import reactivemongo.bson.BSONObjectIDIdentity
import reactivemongo.bson.BSONStringHandler
import reactivemongo.bson.Producer.nameValue2Producer

/*
 * Henri Hietala
 */

object Lanes extends Controller with MongoController {
  val collection = db[BSONCollection]("lanes")

  /** list all lanes */
  def index = Action { implicit request =>
    Async {
      val cursor = collection.find(
        BSONDocument(), BSONDocument()).cursor[Lane] // get all the fields of all the lanes
      val futureList = cursor.toList // convert it to a list of lane
      futureList.map { lanes => Ok(Json.toJson(lanes)) } // convert it to a JSON and return it
    }
  }
  
  /** create a lane from the given JSON */
  def create() = Action(parse.json) { request =>
    Async {
      val orderno = request.body.\("orderno").toString().replace("\"", "")
      val name = request.body.\("name").toString().replace("\"", "")
      val description = request.body.\("description").toString().replace("\"", "")
      val tasks = Array[Task]()
      val lane = Lane(Option(BSONObjectID.generate), orderno, name, description, tasks) // create the lane
      collection.insert(lane).map(
        _ => Ok(Json.toJson(lane))) // return the created lane in a JSON
    }
  }
  
  /** retrieve the lane for the given id as JSON */
  def show(id: String) = Action(parse.empty) { request =>
    Async {
      val objectID = new BSONObjectID(id) // get the corresponding BSONObjectID
      // get the lane having this id (there will be 0 or 1 result)
      val futureTask = collection.find(BSONDocument("_id" -> objectID)).one[Lane]
      futureTask.map { lane => Ok(Json.toJson(lane)) }
    }
  }
  
  /** update the lane for the given id from the JSON body */
  def update(id: String) = Action(parse.json) { request =>
    Async {
      val objectID = new BSONObjectID(id) // get the corresponding BSONObjectID
      val orderno = request.body.\("orderno").toString().replace("\"", "")
      val name = request.body.\("name").toString().replace("\"", "")
      val description = request.body.\("description").toString().replace("\"", "")
      val tasksJSON = request.body.\("tasks")
      val tasks = tasksJSON.validate[Array[Task]].get //taskFormat.reads(tasksJSON).get
      val modifier = BSONDocument( // create the modifier lane
        "$set" -> BSONDocument(
          "orderno" -> orderno,
          "name" -> name,
          "description" -> description,
          "tasks" -> tasks))
      collection.update(BSONDocument("_id" -> objectID), modifier).map(
        _ => Ok(Json.toJson(Lane(Option(objectID), orderno, name, description, tasks)))) // return the modified lane in a JSON
    }
  }
  
  /** delete a lane for the given id */
  def delete(id: String) = Action(parse.empty) { request =>
    Async {
      val objectID = new BSONObjectID(id) // get the corresponding BSONObjectID
      collection.remove(BSONDocument("_id" -> objectID)).map( // remove the lane
        _ => Ok(Json.obj())).recover { case _ => InternalServerError } // and return an empty JSON while recovering from errors if any
    }
  }
}
