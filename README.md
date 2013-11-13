Monitoring a Play application using Metrics
===========================================

1. Add the dependency `"nl.grons" %% "metrics-scala" % "3.0.3"` to `build.sbt`
2. Implement a helper and some setup following the [metrics-scala Usage](https://github.com/erikvanoosten/metrics-scala#usage)
3. Instrument your code. Using a timer will also give you a counter, so it's a good metering type to start with.
4. Set up the JMX reporter according to the [metrics getting started guide](http://metrics.codahale.com/getting-started/)
5. Run your application
6. Browse to your instrumented page
7. Figure out the PID (`ps -ef|grep java`)
8. Connect jconsole: `jconsole <pid>`
9. Choose *Insecure* if this dialog pops up ![Cancel/Insecure](docs/connection-insecure.png?raw=true)
10. Switch to the MBeans tab and navigate to your metrics: ![request time](docs/requestTime.png?raw=true)
11. Double-click on a bold number to graph it: ![graph](docs/graph.png?raw=true)

This project already has one timer around the processing of the default home page, so you can just `play run` it and connect jconsole. Then refresh the page a couple of times to see the metrics change.