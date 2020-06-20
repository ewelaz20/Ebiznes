package models

import play.api.libs.json.{Json, OFormat}

case class Notify(id: Long, mail: String, product:Long)

object Notify {
  implicit val userFormat: OFormat[Notify] = Json.format[Notify]
}