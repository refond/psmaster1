package controllers

import play.api._
import play.api.mvc._

import javax.inject.Inject
import com.escalesoft.psmod1.Psmod1Component

class Application @Inject() (psmod1: Psmod1Component) extends Controller {

  def index = Action {
    Ok(views.html.index(psmod1.wave("Message from psmaster1")))
  }

}
