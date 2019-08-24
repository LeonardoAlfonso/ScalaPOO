package Ejemplos

import scala.util._

object optionList extends App
{
    var lista : List[Integer] = List()
    println(indiceLista(0))

    def indiceLista(indice : Integer) : Try[Integer] = 
    {
        return Try(lista(0))
    }
}