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

  def getWishlistForUser(userId: Long) = Action.async { implicit request: Request[AnyContent] =>
    val wishlist = wishListRepository.getWishlistForUser(userId)
    wishlist.map(body => Ok(Json.toJson(body)).withHeaders("Access-Control-Allow-Origin" -> "http://localhost:3000")
    )
  }

  def addFav(userId: Long, productId: Long) = Action { implicit request: Request[AnyContent] =>
    val fav = Favourite(userId, productId);
    println("ADDING " + fav)
    wishListRepository.addFavourite(fav)
    Ok(Json.toJson(fav))
  }

  def deleteFav(userId: Long, productId: Long) = Action.async { implicit request: Request[AnyContent] =>
    wishListRepository.deleteFavourite(userId, productId).map(_ => Ok)
  }

}
