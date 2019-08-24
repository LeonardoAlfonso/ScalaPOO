package Ejemplos

import scala.util._

object tryScala extends App
{
    println(division(1,1))

    def division(numero1 : Int, numero2 : Int) : Try[Integer] =
    {
        return Try(numero1/numero2)
    }
}