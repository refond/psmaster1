name := """psmaster1"""

organization := """com.escalesoft"""

version := "0.0.1-SNAPSHOT"

// disablePlugins(PlayLayoutPlugin) activates standard SBT Maven layout as documented at: 
// https://playframework.com/documentation/2.4.x/Anatomy
lazy val root = (project in file(".")).enablePlugins(PlayScala).disablePlugins(PlayLayoutPlugin)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "com.escalesoft" %% "psmod1" % "0.0.3-SNAPSHOT",
  jdbc,
  cache,
  ws,
  specs2 % Test
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
