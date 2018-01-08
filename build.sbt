lazy val scalaJsBootstrap = project.in(file(".")).
  enablePlugins(ScalaJSPlugin)

name := "scala-js-bootstrap"

description := "Scala.js Bootstrap Facade"

version := "1.8"

organization := "ch.diadys"

organizationName := "Diadys Sarl"

organizationHomepage := Some(url("http://diadys.sarl"))

startYear := Some(2016)

licenses += "GPLv3" -> url("http://www.gnu.org/licenses/gpl-3.0.html")

homepage := Some(url("https://github.com/diadys/scala-js-bootstrap"))

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  "be.doeraene" %%% "scalajs-jquery" % "0.9.2",
  "org.webjars" % "bootstrap" % "3.3.7-1"
)

val jqueryVersion = "3.2.1"
val bootstrapVersion = "3.3.7-1"

jsDependencies ++= Seq(
	"org.webjars" % "jquery" % jqueryVersion / (jqueryVersion + "/dist/jquery.js") minified (jqueryVersion + "/dist/jquery.min.js"),
    "org.webjars" % "bootstrap" % bootstrapVersion / "bootstrap.js" minified "bootstrap.min.js" dependsOn (jqueryVersion + "/dist/jquery.js")
)

scmInfo := Some(ScmInfo(
    url("https://github.com/diadys/scala-js-bootstrap.git"),
    "scm:git:git@github.com:diadys/scala-js-bootstrap.git",
    Some("scm:git:git@github.com:diadys/scala-js-bootstrap.git")))
    
publishMavenStyle := true

pomExtra :=
  <developers>
    <developer>
      <id>diadys</id>
      <name>Didier Mounoud</name>
      <url>http://github.com/diadys/</url>
    </developer>
  </developers>
