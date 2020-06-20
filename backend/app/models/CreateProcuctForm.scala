package models


import play.api.data.Form
import play.api.data.Forms._

case class CreateProductForm(id: Long, name: String, reference: String, description: String, quantity: Int, price: Int, status: String, category: Int, image:String)

object CreateProductForm {

  val form: Form[CreateProductForm] = Form {
    mapping(
      "id" -> longNumber,
      "name" -> nonEmptyText,
      "reference" -> nonEmptyText,
      "description" -> nonEmptyText,
      "quantity" -> number,
      "price" -> number,
      "status" -> nonEmptyText,
      "category" -> number,
      "image" -> nonEmptyText
    )(CreateProductForm.apply)(CreateProductForm.unapply)
  }
}
