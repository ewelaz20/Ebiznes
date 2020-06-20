package models

import play.api.libs.json._

case class Size(productId: Long, value: String)

object Size {
  implicit val categoryFormat: OFormat[Size] = Json.format[Size]
}