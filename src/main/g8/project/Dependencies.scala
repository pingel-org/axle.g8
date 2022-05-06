import sbt._

object Dependencies {

  lazy val axle = Seq(
    "org.axle-lang" %% "axle-core"  % "0.6.3",
    "org.axle-lang" %% "axle-xml"   % "0.6.3",
    "org.axle-lang" %% "axle-jung"  % "0.6.3",
    "org.axle-lang" %% "axle-jblas" % "0.6.3",
    "org.axle-lang" %% "axle-joda"  % "0.6.3"
  )

  // needed by axle-jung (and for unit conversions)
  lazy val jung = Seq(
    "net.sf.jung"            % "jung-visualization" % "2.1",
    "net.sf.jung"            % "jung-algorithms"    % "2.1",
    "net.sf.jung"            % "jung-api"           % "2.1",
    "net.sf.jung"            % "jung-graph-impl"    % "2.1",
    //"net.sf.jung"          % "jung-io"            % "2.1"
  )

  // for animations
  lazy val monix = Seq(
    "io.monix"               %% "monix-reactive"    % "3.4.0"
  )

  // needed by axle-joda
  lazy val joda = Seq(
    "joda-time"              % "joda-time"          % "2.9.4",
    "org.joda"               % "joda-convert"       % "1.8.1"
  )

  // needed by axle-jblas
  lazy val jblas = "org.jblas"              % "jblas"              % "1.2.4"

  // needed by axle-xml
  lazy val scalaXml = "org.scala-lang.modules" %% "scala-xml"         % "1.3.0"

  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.2.11"
}
