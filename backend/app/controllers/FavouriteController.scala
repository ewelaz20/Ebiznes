package controllers

import com.mohiva.play.silhouette.api.Silhouette
import javax.inject._
import models.Favourite
import models.repositories.WishListRepository
import play.api._
import play.api.libs.json.Json
import play.api.mvc._
import auth.DefaultEnv

import scala.concurrent.{ExecutionContext, Future}


@Singleton
class FavouriteController @Inject()(cc: MessagesControllerComponents,
                                    silhouette: Silhouette[DefaultEnv],
                                    val controllerComponents: ControllerComponents,
                                    wishListRepository: WishListRepository)(implicit ec: ExecutionContext) extends BaseController {

  def getWishlistForUser() = silhouette.SecuredAction.async { implicit request =>
    val wishlist = wishListRepository.getWishlistForUser(request.identity.id)
    wishlist.map(body => Ok(Json.toJson(body))
    )
  }

  def addFav(productId: Long) = silhouette.SecuredAction.async { implicit request =>
    val fav = Favourite(request.identity.id, productId);
    wishListRepository.addFavourite(fav)
    Future(Ok(Json.toJson(fav)))
  }

  def deleteFav(productId: Long) = silhouette.SecuredAction.async { implicit request =>
    wishListRepository.deleteFavourite(request.identity.id, productId).map(_ => Ok)
  }

}
