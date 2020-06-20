package models

import play.api.libs.json._


case class About(id: Int, about: String)

object About {
  implicit val categoryFormat: OFormat[About] = Json.format[About]
}