package controllers

import play.api._
import play.api.mvc._
import traits._
import scala.concurrent.ExecutionContext.Implicits.global

object Application extends Controller with Instrumented {
  private val requestTime = metrics.timer("requestTime")
  def index = Action {
    requestTime.time(
      Ok(views.html.index("Your new application is ready."))
    )
  }

}