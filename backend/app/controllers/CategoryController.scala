package controllers

import models.Category

import javax.inject._
import models.repositories.CategoryRepository
import play.api.data.Form
import play.api.data.Forms.{mapping, _}
import play.api.libs.json.Json
import play.api.mvc._

import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Failure, Success}


@Singleton
class CategoryController @Inject()(messagesControllerComponents: MessagesControllerComponents, categoryRepository: CategoryRepository)(implicit ec: ExecutionContext) extends MessagesAbstractController(messagesControllerComponents) {


  var categories: Seq[Category] = Seq[Category]()


  val categoryForm: Form[CreateCategoryForm] = Form {
    mapping(
      "id" -> number,
      "name" -> nonEmptyText,

    )(CreateCategoryForm.apply)(CreateCategoryForm.unapply)
  }


  val updateCategoryForm: Form[UpdateCategoryForm] = Form {
    mapping(
      "id" -> number,
      "name" -> nonEmptyText

    )(UpdateCategoryForm.apply)(UpdateCategoryForm.unapply)
  }

  val deleteCategoryForm: Form[DeleteCategoryForm] = Form {
    mapping(
      "id" -> number
    )(DeleteCategoryForm.apply)(DeleteCategoryForm.unapply)
  }



  def addCategoryForm(): Action[AnyContent] = Action.async { implicit request: MessagesRequest[AnyContent] =>
    val formCategory = categoryRepository.list()
    for {
      categories <- formCategory
    } yield Ok(views.html.categoryCreate(categoryForm, categories))
  }



  def saveAddedCategory(): Action[AnyContent] = Action.async { implicit request =>


    categoryForm.bindFromRequest.fold(
      errorForm => {
        Future.successful(
          BadRequest(views.html.categoryCreate(errorForm, categories))
        )
      },
      category => {
        println(category)
        categoryRepository.add(category.name).map { _ =>
          routes.CategoryController.addCategoryForm()
          Ok("ok")
        }
      }
    )
  }



  def updateCategoryForm(id: Int): Action[AnyContent] = Action.async { implicit request: MessagesRequest[AnyContent] =>

   categoryRepository.getById(id).map(category => {
      val filledUpdateForm = updateCategoryForm.fill(UpdateCategoryForm(category.id, category.name))
      Ok(views.html.categoryUpdate(filledUpdateForm, categories))
    })

  }
  def saveUpdatedCategory(): Action[AnyContent] = Action.async { implicit request =>
    updateCategoryForm.bindFromRequest.fold(
      errorForm => {
        Future.successful(
          BadRequest(views.html.categoryUpdate(errorForm, categories))
        )
      },
      category => {

        categoryRepository.update(Category(category.id, category.name)).map { _ =>
          routes.CategoryController.updateCategoryForm(category.id)
          Ok("ok")
        }
      }
    )
  }

  def deleteForm(id: Int): Action[AnyContent] = Action.async { implicit request =>
    categoryRepository.getById(id).map(product => {
      val deleteCForm = deleteCategoryForm.fill(DeleteCategoryForm(product.id))
      Ok(views.html.categoryDelete(deleteCForm, categories))
    })
  }

  def deleteHandle(): Action[AnyContent] = Action.async { implicit request =>
    deleteCategoryForm.bindFromRequest.fold(
      errorForm => {
        Future.successful(
          BadRequest(views.html.categoryDelete(errorForm, categories))
        )
      },
      category => {

        categoryRepository.delete(category.id).map { _ =>
          routes.CategoryController.deleteForm(category.id)
          Ok("ok")
        }
      }
    )
  }





  def listOfCategories() = Action.async { implicit request: Request[AnyContent] =>
    categoryRepository.list().map(categoryList => Ok(Json.toJson(categoryList)))
  }

  def addCategory(catName: String) = Action.async { implicit request: Request[AnyContent] =>
    categoryRepository.add(catName).map(added => Ok(Json.toJson(added)))
  }


  def deleteCategory(categoryId: Int) = Action.async { implicit request: Request[AnyContent] =>
    categoryRepository.delete(categoryId).map(_ => Ok)
  }


}
case class CreateCategoryForm(id: Int, name: String)
case class UpdateCategoryForm(id: Int, name: String)
case class DeleteCategoryForm(id: Int)
