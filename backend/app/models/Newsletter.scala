package models

import play.api.libs.json.{Json, OFormat}

case class Newsletter(id: Long, mail: String)

object Newsletter {
  implicit val userFormat: OFormat[Newsletter] = Json.format[Newsletter]
}