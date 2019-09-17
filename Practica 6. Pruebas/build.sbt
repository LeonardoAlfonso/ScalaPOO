ThisBuild / organization := "JaverianaCali"
ThisBuild / version      := "1.0"

lazy val root = (project in file("."))
  .settings(
    name := "Pruebas",
    scalaVersion := "2.12.8",
    libraryDependencies ++= Seq( 
      "org.scalactic" %% "scalactic" % "3.0.8",
      "org.scalatest" %% "scalatest" % "3.0.8" % "test"
      ),
    resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"
  )