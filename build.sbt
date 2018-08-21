import sbt.CrossVersion

name := "sample-macro"

version := "0.1"

scalaVersion := "2.11.12"

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % scalaVersion.value,
  compilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full)
)