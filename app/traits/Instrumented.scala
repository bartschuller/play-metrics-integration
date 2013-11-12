package traits

trait Instrumented extends nl.grons.metrics.scala.InstrumentedBuilder {
  val metricRegistry = controllers.Global.metricRegistry
}