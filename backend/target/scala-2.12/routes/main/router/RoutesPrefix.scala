// @GENERATOR:play-routes-compiler
// @SOURCE:E:/Studia/2 sem zaocz/backend/conf/routes
// @DATE:Fri May 08 19:37:29 CEST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
