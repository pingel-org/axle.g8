import Dependencies._

ThisBuild / scalaVersion     := "2.13.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "$name$",
    libraryDependencies ++= axle ++ jung ++ monix ++ joda ++ Seq(jblas, scalaXml, scalaTest)
)
