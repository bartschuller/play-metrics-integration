package controllers

import play.api._
import play.api.mvc._
import traits._
import scala.concurrent.ExecutionContext.Implicits.global

object Application extends Controller with Instrumented {
  private val requests = metrics.counter("requests")

  def index = Action {
    requests += 1
    Ok(views.html.index("Your new application is ready."))
  }

}