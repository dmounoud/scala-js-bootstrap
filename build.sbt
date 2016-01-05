lazy val scalaJsBootstrap = project.in(file(".")).
  enablePlugins(ScalaJSPlugin)

name := "scala-js-bootstrap"

description := "Scala.js Bootstrap Facade"

version := "1.0"

organization := "ch.diadys"

organizationName := "Diadys Sarl"

organizationHomepage := Some(url("http://diadys.sarl"))

startYear := Some(2016)

licenses += "GPLv3" -> url("http://www.gnu.org/licenses/gpl-3.0.html")

homepage := Some(url("https://github.com/diadys/scala-js-bootstrap"))

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "be.doeraene" %%% "scalajs-jquery" % "0.8.1",
  "org.webjars" % "bootstrap" % "3.3.6"
)

jsDependencies ++= Seq(
    "org.webjars" % "bootstrap" % "3.3.6" / "bootstrap.js" minified "bootstrap.min.js" dependsOn "jquery.js"
)

pomExtra :=
  <scm>
    <url>git@github.com:diadys/scala-js-bootstrap.git</url>
    <connection>scm:git:git@github.com:diadys/scala-js-bootstrap.git</connection>
  </scm>
  <developers>
    <developer>
      <id>diadys</id>
      <name>Didier Mounoud</name>
      <url>http://github.com/diadys/</url>
    </developer>
  </developers>
