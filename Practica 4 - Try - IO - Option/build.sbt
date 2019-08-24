ThisBuild / organization := "JaverianaCali"
ThisBuild / version      := "1.0"

lazy val root = (project in file("."))
  .settings(
    name := "Option Try IO Files Serialization",
    scalaVersion := "2.12.8",
    Compile / run / fork := true //Corrije error en la serialización de Listas y Secuencias.
                                 //Puede generar conflictos con scala.util.io.
  )
