package models.repositories

import com.google.inject.Inject
import javax.inject.Singleton
import models.{Favourite, Product}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile
import slick.lifted.TableQuery

import scala.concurrent.{ExecutionContext, Future}


@Singleton
class WishListRepository @Inject()(val dbConfigProvider: DatabaseConfigProvider, val productRepository: ProductsRepository, val userRepository: UsersRepository)(implicit ec: ExecutionContext) {

  private val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import productRepository.ProductTable

  private val products = TableQuery[ProductTable]
  private val favourites = TableQuery[Favourites]

  import profile.api._


  private class Favourites(tag: Tag) extends Table[Favourite](tag, "favourites") {
    def user = column[Long]("user")

    def user_fk = foreignKey("user_fk", product, products)(_.id)

    def product = column[Long]("product")

    def product_fk = foreignKey("product_fk", product, products)(_.id)

    def * = (user, product) <> ((Favourite.apply _).tupled, Favourite.unapply)
  }

  def getWishlistForUser(userId: Long): Future[Seq[Product]] = {
    val query = for {
      favourite <- favourites if favourite.user === userId
      product <- products if favourite.product === product.id
    } yield product
    db.run(query.result)
  }

  def addFavourite(favourite: Favourite): Unit = db.run {
    favourites += favourite
  }

  def deleteFavourite(userId: Long, productId: Long): Future[Unit] = db.run {
    favourites.filter(fav => fav.user === userId && fav.product === productId).delete.map(_ => ())
  }
}
