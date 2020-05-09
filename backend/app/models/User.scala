package models

import play.api.libs.json.{Json, OFormat}

case class User(id: Long, name: String, mail: String, password: String)

object User {
  implicit val userFormat: OFormat[User] = Json.format[User]
}