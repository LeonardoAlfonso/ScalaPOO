package Ejemplos

import scala.io.StdIn

object consoleIO extends App {

    println("Digite su nombre")
    val nombre = readLine()
    println("Su nombre es: " + nombre)
}