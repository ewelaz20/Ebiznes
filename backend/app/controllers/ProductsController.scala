package controllers

import javax.inject._
import models.Product
import models.repositories.ProductsRepository
import play.api._
import play.api.libs.json.Json
import play.api.mvc._

import scala.concurrent.ExecutionContext


@Singleton
class ProductsController @Inject()(val controllerComponents: ControllerComponents, productsRepository: ProductsRepository)(implicit ec: ExecutionContext) extends BaseController {

  //add product
  def addProduct() = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }

  def addProductHandle() = Action.async { implicit request: Request[AnyContent] =>
    val product: Product = request.body.asJson.get.as[Product]
    val response = productsRepository.addProduct(product)
    response.map(productResponse => Ok(Json.toJson(productResponse)))
  }

  // delete
  def deleteProduct(productId: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }

  //get products
  def getProducts() = Action.async { implicit request: Request[AnyContent] =>
    val productList = productsRepository.list() // zwraca feature z lista produktow
    productList.map(products =>
      Ok(Json.toJson(products))
    )
  }
  def getProductsByCategory(categoryId:Int) = Action.async { implicit request: Request[AnyContent] =>
    val productList = productsRepository.getByCategory(categoryId)
    productList.map(products =>
      Ok(Json.toJson(products))
    )
  }

  def getProduct(productId: Long) = Action.async { implicit request: Request[AnyContent] =>
    val product = productsRepository.getById(productId)
    println("GETTING IT")
    product.map(body =>
      Ok(Json.toJson(body))

    )
  }

  // update product
  def updateProduct(productId: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }

  def updateProductHandle() = Action { implicit request: Request[AnyContent] =>
    Ok("ok")
  }


}
