package Ejemplos

import scala.util._

object consoleIOTry extends App {

    println("Digite el primer numero")
    var numero1 : String = readLine()
    println("Digite el segundo numero")
    var numero2 : String = readLine()

    var division : Try[Integer] = division(numero1, numero2)
    division match{
        case Success(s) => println("El resultado es: " + s)
        case Failure(f) => println("Error en la operacion: " + f)
    }

    def division(numero1 : String, numero2 : String) : Try[Integer] =
    {
        return Try(numero1.toInt/numero2.toInt)
    }
}