package controllers

import play.api._
import com.codahale.metrics.JmxReporter

object Global extends GlobalSettings {
  /** The application wide metrics registry. */
  val metricRegistry = new com.codahale.metrics.MetricRegistry()
  val reporter = JmxReporter.forRegistry(metricRegistry).build()
  reporter.start()
}
