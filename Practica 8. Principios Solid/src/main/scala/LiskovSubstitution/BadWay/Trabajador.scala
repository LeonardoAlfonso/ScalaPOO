package LiskovSubstitution.BadWay

import scala.util.Try

abstract class Trabajador
{
    protected var _horasTrabajadasMes : Double = _
    protected var _nivelAceite : Double = 0
    protected var _direccion : String = _

    def trabajar(tarea: String) : Try[Double]
    def testAceite() : Double
    def cambiarDireccion(nuevaDireccion: String) : Try[Unit]
}