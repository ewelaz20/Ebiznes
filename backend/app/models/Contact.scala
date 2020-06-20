package models

import play.api.libs.json._


case class Contact(id: Int, address: String, phone: String, email: String)

object Contact {
  implicit val categoryFormat: OFormat[Contact] = Json.format[Contact]
}