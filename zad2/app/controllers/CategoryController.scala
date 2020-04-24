package controllers

import javax.inject._
import play.api._
import play.api.mvc._


@Singleton
class CategoryController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  //add product
  def listOfCategories() = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }
  def addCategory(catName:String) = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }
  // delete
  def deleteCategory(catName:String) = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }


}
