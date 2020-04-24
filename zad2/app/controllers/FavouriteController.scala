package controllers

import javax.inject._
import play.api._
import play.api.mvc._


@Singleton
class FavouriteController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  //add product
  def listOfFav() = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }
  def addFav(productId:Long) = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }
  // delete
  def deleteFav(productId:Long) = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }

}
