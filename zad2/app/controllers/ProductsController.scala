package controllers

import javax.inject._
import play.api._
import play.api.mvc._


@Singleton
class ProductsController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  //add product
  def addProduct() = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }
  def addProductHandle() = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }
  // delete
  def deleteProduct(productId:Long) = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }

  //get products
  def getProducts() = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }

  def getProduct(productId:Long) = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }

  // update product
  def updateProduct(productId:Long) = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }
  def updateProductHandle() = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }


}
