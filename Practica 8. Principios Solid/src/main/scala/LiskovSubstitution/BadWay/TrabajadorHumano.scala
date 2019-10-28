package LiskovSubstitution.BadWay

import scala.util.Try

class TrabajadorHumano extends Trabajador
{
    def trabajar(tarea: String) : Try[Double] = 
    {
        return Try(0d);
    }

    def testAceite() : Double = 
    {
         throw new Exception("Humanos no tiene aceite")
    }

    def cambiarDireccion(nuevaDireccion: String) : Try[Unit] =
    {
        Try(_direccion = nuevaDireccion)
    }
}