package controllers

import javax.inject._
import models.Favourite
import models.repositories.WishListRepository
import play.api._
import play.api.libs.json.Json
import play.api.mvc._

import scala.concurrent.ExecutionContext


@Singleton
class FavouriteController @Inject()(val controllerComponents: ControllerComponents, wishListRepository: WishListRepository)(implicit ec: ExecutionContext) extends BaseController {

  //add product
  def getWishlistForUser(userId: Long) = Action.async { implicit request: Request[AnyContent] =>
    val wishlist = wishListRepository.getWishlistForUser(userId)
    wishlist.map(body => Ok(Json.toJson(body)).withHeaders("Access-Control-Allow-Origin" -> "http://localhost:3000")
    )
  }

  def addFav() = Action { implicit request: Request[AnyContent] =>
   val fav = request.body.asJson.get.as[Favourite]
    println("ADDING "+ fav)
    wishListRepository.addFavourite(fav)
    Ok(Json.toJson(fav)).withHeaders("Access-Control-Allow-Origin" -> "http://localhost:3000")
  }

  // delete
  def deleteFav() = Action { implicit request: Request[AnyContent] =>
    Ok("ok").withHeaders("Access-Control-Allow-Origin" -> "http://localhost:3000")
  }

}
