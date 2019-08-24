package Ejemplos

object patternMatching extends App{
    var option : Int = 1

    option match{
        case 0 => println("Ha elejido la opcion 0")
        case 1 => println("Ha elejido la opcion 1")
        case _ => println("Opcion inexistente")
    }
}