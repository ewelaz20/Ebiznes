package models

import play.api.libs.json.{Json, OFormat}

case class Favourite(user: String, product: Long)

object Favourite {
  implicit val favouriteFormat: OFormat[Favourite] = Json.format[Favourite]
}
