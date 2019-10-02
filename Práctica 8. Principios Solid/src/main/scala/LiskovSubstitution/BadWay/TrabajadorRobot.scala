package LiskovSubstitution.BadWay

import scala.util.Try

class TrabajadorRobot extends Trabajador
{
    def trabajar(tarea: String) : Try[Double] =
    {
        return Try(0d);
    }

    def testAceite() : Double =
    {
        return _nivelAceite
    }

    def cambiarDireccion(nuevaDireccion: String) : Try[Unit] =
    {
        throw new Exception("Robots no tiene direccion")
    }
}