package LiskovSubstitution.GoodWay

import scala.util.Try

class TrabajadorHumano extends Trabajador with ITramitesHumano
{
    def trabajar(tarea: String) : Try[Double] = 
    {
        return Try(0d);
    }

    def cambiarDireccion(nuevaDireccion: String) : Try[Unit] =
    {
        Try(_direccion = nuevaDireccion)
    }
}