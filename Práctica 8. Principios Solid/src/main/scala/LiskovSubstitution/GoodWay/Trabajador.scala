package LiskovSubstitution.GoodWay

import scala.util.Try

abstract class Trabajador
{
    protected var _horasTrabajadasMes : Double = _    
    def trabajar(tarea: String) : Try[Double]
}