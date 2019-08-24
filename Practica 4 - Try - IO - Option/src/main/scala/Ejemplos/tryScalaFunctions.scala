package Ejemplos

import scala.util._

object tryScalaFunctions extends App
{
    var division : Try[Integer] = division(1,1)
    division match{
        case Success(s) => println("El resultado es: " + s)
        case Failure(f) => println("Error en la operacion: " + f)
    }

    if (division.isSuccess)
    {
        println("La division es correcta")
    }

    def division(numero1 : Int, numero2 : Int) : Try[Integer] =
    {
        return Try(numero1/numero2)
    }
}