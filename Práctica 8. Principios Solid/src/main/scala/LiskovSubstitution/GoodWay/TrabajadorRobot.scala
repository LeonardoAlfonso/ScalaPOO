package LiskovSubstitution.GoodWay

import scala.util.Try

class TrabajadorRobot extends Trabajador with IProcesosRobot
{
    def trabajar(tarea: String) : Try[Double] =
    {
        return Try(0d);
    }

    def testAceite() : Double =
    {
        return _nivelAceite
    }
}