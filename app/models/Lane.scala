package models

import play.api.libs.json.Json

import models.Task.TaskBSONReader
import models.Task.TaskBSONWriter
import play.api.libs.functional.syntax.functionalCanBuildApplicative
import play.api.libs.functional.syntax.toFunctionalBuilderOps
import reactivemongo.bson.BSONDocument
import reactivemongo.bson.BSONDocumentReader
import reactivemongo.bson.BSONDocumentWriter
import reactivemongo.bson.BSONObjectID
import reactivemongo.bson.BSONObjectIDIdentity
import reactivemongo.bson.BSONStringHandler
import reactivemongo.bson.Producer.nameValue2Producer
import play.modules.reactivemongo.json.BSONFormats.BSONObjectIDFormat

/*
 * Author: Henri Hietala
 */

case class Lane(id: Option[BSONObjectID], orderno: String, name: String, description: String, tasks: Array[Task])

object Lane {
  /** serialize/Deserialize a Lane into/from JSON value */
  implicit val laneFormat = Json.format[Lane]

  /** serialize a Lane into a BSON */
  implicit object LaneBSONWriter extends BSONDocumentWriter[Lane] {
    def write(lane: Lane): BSONDocument =
      BSONDocument(
        "_id" -> lane.id.getOrElse(BSONObjectID.generate),
        "orderno" -> lane.orderno,
        "name" -> lane.name,
        "description" -> lane.description,
        "tasks" -> lane.tasks)
  }

  /** deserialize a Lane from a BSON */
  implicit object LaneBSONReader extends BSONDocumentReader[Lane] {
    def read(doc: BSONDocument): Lane =
      Lane(
        doc.getAs[BSONObjectID]("_id"),
        doc.getAs[String]("orderno").get,
        doc.getAs[String]("name").get,
        doc.getAs[String]("description").get,
        doc.getAs[Array[Task]]("tasks").get)
  }
}