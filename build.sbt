val ScalatraVersion = "2.6.5"

organization := "com.example"

name := "User Management"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.6"

resolvers += Classpaths.typesafeReleases

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % ScalatraVersion,
  "org.scalatra" %% "scalatra-scalatest" % ScalatraVersion % "test",
  "ch.qos.logback" % "logback-classic" % "1.2.3" % "runtime",
  "org.eclipse.jetty" % "jetty-webapp" % "9.4.9.v20180320" % "container",
  "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided",
  "org.squeryl" %% "squeryl" % "0.9.9",
  "com.h2database" % "h2" % "1.4.196",
  "c3p0" % "c3p0" % "0.9.5.2"
)

enablePlugins(SbtTwirl)
enablePlugins(ScalatraPlugin)
