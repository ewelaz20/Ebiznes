package controllers

import javax.inject._
import models.repositories.CategoryRepository
import play.api.libs.json.Json
import play.api.mvc._

import scala.concurrent.ExecutionContext

@Singleton
class CategoryController @Inject()(val controllerComponents: ControllerComponents, categoryRepository: CategoryRepository)(implicit ec: ExecutionContext) extends BaseController {


  //add product
  def listOfCategories() = Action.async { implicit request: Request[AnyContent] =>
    categoryRepository.list().map(categoryList => Ok(Json.toJson(categoryList)))
  }

  def addCategory(catName: String) = Action.async { implicit request: Request[AnyContent] =>
    categoryRepository.add(catName).map(added => Ok(Json.toJson(added)))
  }

  // delete
  def deleteCategory(categoryId: Int) = Action.async { implicit request: Request[AnyContent] =>
    categoryRepository.delete(categoryId).map(_ => Ok)
  }


}
