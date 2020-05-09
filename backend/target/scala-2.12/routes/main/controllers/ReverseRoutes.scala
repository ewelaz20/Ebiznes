// @GENERATOR:play-routes-compiler
// @SOURCE:E:/Studia/2 sem zaocz/backend/conf/routes
// @DATE:Fri May 08 19:37:29 CEST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:49
  class ReverseContactController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:49
    def getContactData(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "contact")
    }
  
    // @LINE:50
    def sendContactEmail(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "contact/publish")
    }
  
  }

  // @LINE:66
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:66
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:53
  class ReverseFavouriteController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:54
    def addFav(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "kurwa")
    }
  
    // @LINE:53
    def getWishlistForUser(userId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "fav/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)))
    }
  
    // @LINE:55
    def deleteFav(): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "favDelete")
    }
  
  }

  // @LINE:37
  class ReverseNewsletterController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:37
    def newsletterForm(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "newsletterForm")
    }
  
    // @LINE:38
    def addToNewsletter(userId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addToNewsletter/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)))
    }
  
  }

  // @LINE:41
  class ReverseAvailabilityController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def notifyAvailability(productId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "notify/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("productId", productId)))
    }
  
  }

  // @LINE:58
  class ReversePaymentController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:60
    def paymentHandle(paymentId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "paymentHandle/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("paymentId", paymentId)))
    }
  
    // @LINE:59
    def payment(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "payment")
    }
  
    // @LINE:58
    def listOfPayments(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "paymentList")
    }
  
    // @LINE:61
    def deletePayment(paymentId:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "paymentDelete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("paymentId", paymentId)))
    }
  
  }

  // @LINE:16
  class ReverseSettingsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def userLogout(): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "userLogout")
    }
  
    // @LINE:16
    def userSettings(): Call = {
    
      () match {
      
        // @LINE:16
        case ()  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "userSettings")
      
      }
    
    }
  
    // @LINE:19
    def deleteUser(userId:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "deleteUser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)))
    }
  
  }

  // @LINE:44
  class ReverseCategoryController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:45
    def addCategory(catName:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addCategory/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("catName", catName)))
    }
  
    // @LINE:46
    def deleteCategory(categoryId:Int): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "deleteCategory/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("categoryId", categoryId)))
    }
  
    // @LINE:44
    def listOfCategories(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "categories")
    }
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:10
  class ReverseAuthController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def userRegisterHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "userRegisterHandle")
    }
  
    // @LINE:11
    def userLoginHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "userLoginHandle")
    }
  
    // @LINE:10
    def userLogin(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "userLogin")
    }
  
    // @LINE:12
    def userRegister(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "userRegister")
    }
  
  }

  // @LINE:22
  class ReverseProductsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def getProduct(productId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "product/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("productId", productId)))
    }
  
    // @LINE:22
    def getProducts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products")
    }
  
    // @LINE:28
    def updateProductHandle(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "updateproducthandle")
    }
  
    // @LINE:26
    def addProductHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addproducthandle")
    }
  
    // @LINE:29
    def deleteProduct(productId:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("productId", productId)))
    }
  
    // @LINE:24
    def getProductsByCategory(categoryId:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products/category/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("categoryId", categoryId)))
    }
  
    // @LINE:27
    def updateProduct(productId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateproduct/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("productId", productId)))
    }
  
    // @LINE:25
    def addProduct(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addproduct")
    }
  
  }

  // @LINE:32
  class ReverseBasketController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def basketForm(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "basket")
    }
  
    // @LINE:33
    def addToBasket(productId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addToBasket/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("productId", productId)))
    }
  
    // @LINE:34
    def deleteFromBasket(productId:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "deleteFromBasket/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("productId", productId)))
    }
  
  }


}
