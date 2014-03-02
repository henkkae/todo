// @SOURCE:D:/Ohjelmat/play-2.1.5/samples/scala/test/eventual/conf/routes
// @HASH:64dbd09597237fb5fd021d80dbb9d27aeaa16889
// @DATE:Fri Feb 28 21:42:40 EET 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:22
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers {

// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
class ReverseLanes {
    

// @LINE:16
def delete(id:String): Call = {
   Call("DELETE", _prefix + { _defaultPrefix } + "api/lanes/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                                                

// @LINE:13
def create(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "api/lanes/new")
}
                                                

// @LINE:14
def show(id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/lanes/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                                                

// @LINE:15
def update(id:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "api/lanes/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                                                

// @LINE:12
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/lanes")
}
                                                
    
}
                          

// @LINE:22
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:22
// @LINE:6
def index(any:String): Call = {
   (any: @unchecked) match {
// @LINE:6
case (any) if any == "none" => Call("GET", _prefix)
                                                        
// @LINE:22
case (any) if true => Call("GET", _prefix + { _defaultPrefix } + implicitly[PathBindable[String]].unbind("any", any))
                                                        
   }
}
                                                

// @LINE:9
def loadPublicHTML(any:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "views/" + implicitly[PathBindable[String]].unbind("any", any))
}
                                                
    
}
                          

// @LINE:19
class ReverseAssets {
    

// @LINE:19
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          
}
                  


// @LINE:22
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
class ReverseLanes {
    

// @LINE:16
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Lanes.delete",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/lanes/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:13
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Lanes.create",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/lanes/new"})
      }
   """
)
                        

// @LINE:14
def show : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Lanes.show",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/lanes/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:15
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Lanes.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/lanes/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:12
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Lanes.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/lanes"})
      }
   """
)
                        
    
}
              

// @LINE:22
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:22
// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function(any) {
      if (any == """ + implicitly[JavascriptLitteral[String]].to("none") + """) {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("any", any)})
      }
      }
   """
)
                        

// @LINE:9
def loadPublicHTML : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loadPublicHTML",
   """
      function(any) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "views/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("any", any)})
      }
   """
)
                        
    
}
              

// @LINE:19
class ReverseAssets {
    

// @LINE:19
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              
}
        


// @LINE:22
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
class ReverseLanes {
    

// @LINE:16
def delete(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Lanes.delete(id), HandlerDef(this, "controllers.Lanes", "delete", Seq(classOf[String]), "DELETE", """""", _prefix + """api/lanes/$id<[^/]+>""")
)
                      

// @LINE:13
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Lanes.create(), HandlerDef(this, "controllers.Lanes", "create", Seq(), "POST", """""", _prefix + """api/lanes/new""")
)
                      

// @LINE:14
def show(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Lanes.show(id), HandlerDef(this, "controllers.Lanes", "show", Seq(classOf[String]), "GET", """""", _prefix + """api/lanes/$id<[^/]+>""")
)
                      

// @LINE:15
def update(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Lanes.update(id), HandlerDef(this, "controllers.Lanes", "update", Seq(classOf[String]), "POST", """""", _prefix + """api/lanes/$id<[^/]+>""")
)
                      

// @LINE:12
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Lanes.index(), HandlerDef(this, "controllers.Lanes", "index", Seq(), "GET", """ Play routes serving JSON to AngularJS start with /api""", _prefix + """api/lanes""")
)
                      
    
}
                          

// @LINE:22
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(any:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(any), HandlerDef(this, "controllers.Application", "index", Seq(classOf[String]), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:9
def loadPublicHTML(any:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loadPublicHTML(any), HandlerDef(this, "controllers.Application", "loadPublicHTML", Seq(classOf[String]), "GET", """ Play routes serving HTML to AngularJS start with /views""", _prefix + """views/$any<.+>""")
)
                      
    
}
                          

// @LINE:19
class ReverseAssets {
    

// @LINE:19
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          
}
                  
      