import cine._
import scala.io._

object pruebasCine {
    def main(args: Array[String]) {
        var taquilla : Taquilla = new Taquilla
        taquilla.mostrarCatalogo()

        println("Elija una película")
        val peliculaElejida = StdIn.readLine()
       
        if(taquilla.mostrarFuncion(peliculaElejida))
        {
            println("")
        }
    }
}