package models

import play.api.libs.json.Json
import play.api.libs.functional.syntax.functionalCanBuildApplicative
import play.api.libs.functional.syntax.toFunctionalBuilderOps
import reactivemongo.bson.BSONDocument
import reactivemongo.bson.BSONDocumentReader
import reactivemongo.bson.BSONDocumentWriter
import reactivemongo.bson.BSONStringHandler
import reactivemongo.bson.Producer.nameValue2Producer

/*
 * Author: Henri Hietala
 */

case class Task(name: String, description: String)

object Task {
  /** serialize/deserialize a Task into/from JSON value */
  implicit val taskFormat = Json.format[Task]

  /** serialize a Task into a BSON */
  implicit object TaskBSONWriter extends BSONDocumentWriter[Task] {
    def write(task: Task): BSONDocument =
      BSONDocument(
        "name" -> task.name,
        "description" -> task.description)
  }

  /** deserialize a Task from a BSON */
  implicit object TaskBSONReader extends BSONDocumentReader[Task] {
    def read(doc: BSONDocument): Task =
      Task(
        doc.getAs[String]("name").get,
        doc.getAs[String]("description").get)
  }
}