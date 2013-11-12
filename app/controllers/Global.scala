package controllers

import play.api._

object Global extends GlobalSettings {
  /** The application wide metrics registry. */
  val metricRegistry = new com.codahale.metrics.MetricRegistry()
}
