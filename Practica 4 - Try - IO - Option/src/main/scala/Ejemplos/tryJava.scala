package Ejemplos

object tryJava extends App
{
    println(division(1,0))

    def division(numero1 : Int, numero2 : Int) : Integer =
    {
        var result : Int = 0

        try
        {
            result = numero1/numero2
        }
        catch
        {
            case e: Throwable => println("No se puede hacer divison por cero")
        }

        return result
    }
}