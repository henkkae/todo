
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object help extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!-- Modal -->
  <div class="modal fade" id="helpModal" tabindex="-1" role="dialog" aria-labelledby="helpModalLabel" aria-hidden="true">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><i class="fa fa-times"></i></button>
          <h4 class="modal-title" id="helpModalLabel">Instructions</h4>
        </div>
        <div class="modal-body">
          <h1>Editing lane or task names</h1>
          <p>Click on any text to start editing mode. The application will save your input automatically.</p>
          <h1>Drag & Drop</h1>
          <p>You are able to drag and sort tasks to every available lane in any order.</p>
          <p><img src=""""),_display_(Seq[Any](/*14.25*/routes/*14.31*/.Assets.at("images/help_dragndrop.jpg"))),format.raw/*14.70*/("""" alt="drag and drop" /> </p>
          <h1>Delete tasks</h1>
          <p>You can delete task by hovering on a task and click the red cross.</p>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
    </div>
  </div>"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Mar 02 12:36:57 EET 2014
                    SOURCE: D:/Ohjelmat/play-2.1.5/samples/scala/test/eventual/app/views/help.scala.html
                    HASH: 6271550c1a8b2a915cb99540945e02f26cb64247
                    MATRIX: 568->0|1399->795|1414->801|1475->840
                    LINES: 22->1|35->14|35->14|35->14
                    -- GENERATED --
                */
            