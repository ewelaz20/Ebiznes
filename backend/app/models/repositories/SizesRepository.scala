package models.repositories

import javax.inject.{Inject, Singleton}
import models.Size
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class SizesRepository @Inject()(val dbConfigProvider: DatabaseConfigProvider, val productsRepository: ProductsRepository)(implicit ec: ExecutionContext) {
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import productsRepository.ProductTable
  import profile.api._


  class SizeTable(tag: Tag) extends Table[Size](tag, "sizes") {

    def product = column[Long]("product", O.PrimaryKey, O.AutoInc)

    def value = column[String]("value")

    def productFk = foreignKey("product_fk", product, products)(_.id)


    def * = (product, value) <> ((Size.apply _).tupled, Size.unapply)
  }

  private val products = TableQuery[ProductTable]
  private val sizes = TableQuery[SizeTable]

  def getByProductId(productId: Long): Future[Seq[String]] = db.run {
    sizes.filter(_.product === productId).map(size => size.value).result
  }


  def getByProductMapping(productId: Long): Future[Seq[Size]] = db.run {
    sizes.filter(_.product === productId).result
  }

  def addSize(newSize: Size): Future[Size] = db.run {
    sizes returning sizes.map(_.product) into ((newSize, product) => newSize.copy(productId=product)) += (newSize)
  }
  def delete(size:Size): Future[Unit] = db.run{
    sizes.filter(s => s.product === size.productId && s.value=== size.value ).delete.map(_ => ())
  }

  def update(newSize: Size): Future[Unit] = {
    db.run(sizes.filter(_.product === newSize.productId).update(newSize)).map(_ => ())
  }
}