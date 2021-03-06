package models.repositories

import javax.inject.{Inject, Singleton}
import models.Product
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class ProductsRepository @Inject()(val dbConfigProvider: DatabaseConfigProvider, val categoryRepository: CategoryRepository)(implicit ec: ExecutionContext) {
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._


  class ProductTable(tag: Tag) extends Table[Product](tag, "product") {

    /** The ID column, which is the primary key, and auto incremented */
    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)

    /** The name column */
    def name = column[String]("name")
    def reference = column[String]("reference")

    /** The age column */
    def description = column[String]("description")

    def quantity = column[Int]("quantity")

    def price = column[Double]("price")

    def status = column[String]("status")

    def image = column[String]("image")

    def category = column[Int]("category")

    def categoryFk = foreignKey("cat_fk", category, cat)(_.id)


    /**
      * This is the tables default "projection".
      *
      * It defines how the columns are converted to and from the Person object.
      *
      * In this case, we are simply passing the id, name and page parameters to the Person case classes
      * apply and unapply methods.
      */
    def * = (id, name, reference, description,quantity, price, status, image, category) <> ((Product.apply _).tupled, Product.unapply)

  }



  import categoryRepository.CategoryTable

  private val products = TableQuery[ProductTable]

  private val cat = TableQuery[CategoryTable]



  /**
    * List all the people in the database.
    */
  def list(): Future[Seq[Product]] = db.run {
    products.result
  }

  def addProduct(newProduct: Product): Future[Product] = db.run {
    products returning products.map(_.id) into ((newProduct, id) => newProduct.copy(id = id)) += (newProduct)
  }



  def getByCategory(categoryId: Int): Future[Seq[Product]] = db.run {
    products.filter(_.category === categoryId).result
  }

  def getById(id: Long): Future[Product] = db.run {
    products.filter(_.id === id).result.head
  }

  def delete(id: Long): Future[Unit] = db.run(products.filter(_.id === id).delete).map(_ => ())

  def update(newProduct: Product): Future[Unit] = {
    db.run(products.filter(_.id === newProduct.id).update(newProduct)).map(_ => ())
  }

}