package models

import play.api.libs.json.{Json, OFormat}

case class Product(id: Long, name: String, reference: String, description: String, quantity: Int, price: Double, status: String, image: String, category: Int)

object Product {
  implicit val productFormat: OFormat[Product] = Json.format[Product]
}