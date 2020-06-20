package models

import play.api.data.Form
import play.api.data.Forms._

case class DeleteProductForm(id: Long)

object DeleteProductForm {

  val form: Form[DeleteProductForm] = Form {
    mapping(
      "id" -> longNumber,
    )(DeleteProductForm.apply)(DeleteProductForm.unapply)
  }
}
