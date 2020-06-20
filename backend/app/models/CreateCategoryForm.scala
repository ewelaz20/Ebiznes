package models

import play.api.data.Form
import play.api.data.Forms._

case class CreateCategoryForm(id: Long, name: String)

object CreateCategoryForm {

  val form: Form[CreateCategoryForm] = Form {
    mapping(
      "id" -> longNumber,
      "name" -> nonEmptyText

    )(CreateCategoryForm.apply)(CreateCategoryForm.unapply)
  }
}
