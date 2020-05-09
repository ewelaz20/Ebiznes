// @GENERATOR:play-routes-compiler
// @SOURCE:E:/Studia/2 sem zaocz/backend/conf/routes
// @DATE:Fri May 08 19:37:29 CEST 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:49
  class ReverseContactController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:49
    def getContactData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ContactController.getContactData",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contact"})
        }
      """
    )
  
    // @LINE:50
    def sendContactEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ContactController.sendContactEmail",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "contact/publish"})
        }
      """
    )
  
  }

  // @LINE:66
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:66
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:53
  class ReverseFavouriteController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:54
    def addFav: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FavouriteController.addFav",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "kurwa"})
        }
      """
    )
  
    // @LINE:53
    def getWishlistForUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FavouriteController.getWishlistForUser",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fav/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0))})
        }
      """
    )
  
    // @LINE:55
    def deleteFav: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FavouriteController.deleteFav",
      """
        function() {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "favDelete"})
        }
      """
    )
  
  }

  // @LINE:37
  class ReverseNewsletterController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:37
    def newsletterForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NewsletterController.newsletterForm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newsletterForm"})
        }
      """
    )
  
    // @LINE:38
    def addToNewsletter: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NewsletterController.addToNewsletter",
      """
        function(userId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addToNewsletter/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0))})
        }
      """
    )
  
  }

  // @LINE:41
  class ReverseAvailabilityController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def notifyAvailability: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AvailabilityController.notifyAvailability",
      """
        function(productId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "notify/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("productId", productId0))})
        }
      """
    )
  
  }

  // @LINE:58
  class ReversePaymentController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:60
    def paymentHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaymentController.paymentHandle",
      """
        function(paymentId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "paymentHandle/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("paymentId", paymentId0))})
        }
      """
    )
  
    // @LINE:59
    def payment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaymentController.payment",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "payment"})
        }
      """
    )
  
    // @LINE:58
    def listOfPayments: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaymentController.listOfPayments",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paymentList"})
        }
      """
    )
  
    // @LINE:61
    def deletePayment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaymentController.deletePayment",
      """
        function(paymentId0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "paymentDelete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("paymentId", paymentId0))})
        }
      """
    )
  
  }

  // @LINE:16
  class ReverseSettingsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def userLogout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SettingsController.userLogout",
      """
        function() {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "userLogout"})
        }
      """
    )
  
    // @LINE:16
    def userSettings: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SettingsController.userSettings",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userSettings"})
          }
        
        }
      """
    )
  
    // @LINE:19
    def deleteUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SettingsController.deleteUser",
      """
        function(userId0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteUser/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0))})
        }
      """
    )
  
  }

  // @LINE:44
  class ReverseCategoryController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:45
    def addCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.addCategory",
      """
        function(catName0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addCategory/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("catName", catName0))})
        }
      """
    )
  
    // @LINE:46
    def deleteCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.deleteCategory",
      """
        function(categoryId0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteCategory/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("categoryId", categoryId0))})
        }
      """
    )
  
    // @LINE:44
    def listOfCategories: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.listOfCategories",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "categories"})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseAuthController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def userRegisterHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthController.userRegisterHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "userRegisterHandle"})
        }
      """
    )
  
    // @LINE:11
    def userLoginHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthController.userLoginHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "userLoginHandle"})
        }
      """
    )
  
    // @LINE:10
    def userLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthController.userLogin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userLogin"})
        }
      """
    )
  
    // @LINE:12
    def userRegister: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthController.userRegister",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userRegister"})
        }
      """
    )
  
  }

  // @LINE:22
  class ReverseProductsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def getProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductsController.getProduct",
      """
        function(productId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("productId", productId0))})
        }
      """
    )
  
    // @LINE:22
    def getProducts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductsController.getProducts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products"})
        }
      """
    )
  
    // @LINE:28
    def updateProductHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductsController.updateProductHandle",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "updateproducthandle"})
        }
      """
    )
  
    // @LINE:26
    def addProductHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductsController.addProductHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addproducthandle"})
        }
      """
    )
  
    // @LINE:29
    def deleteProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductsController.deleteProduct",
      """
        function(productId0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("productId", productId0))})
        }
      """
    )
  
    // @LINE:24
    def getProductsByCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductsController.getProductsByCategory",
      """
        function(categoryId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products/category/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("categoryId", categoryId0))})
        }
      """
    )
  
    // @LINE:27
    def updateProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductsController.updateProduct",
      """
        function(productId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateproduct/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("productId", productId0))})
        }
      """
    )
  
    // @LINE:25
    def addProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductsController.addProduct",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addproduct"})
        }
      """
    )
  
  }

  // @LINE:32
  class ReverseBasketController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def basketForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BasketController.basketForm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "basket"})
        }
      """
    )
  
    // @LINE:33
    def addToBasket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BasketController.addToBasket",
      """
        function(productId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addToBasket/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("productId", productId0))})
        }
      """
    )
  
    // @LINE:34
    def deleteFromBasket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BasketController.deleteFromBasket",
      """
        function(productId0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteFromBasket/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("productId", productId0))})
        }
      """
    )
  
  }


}
