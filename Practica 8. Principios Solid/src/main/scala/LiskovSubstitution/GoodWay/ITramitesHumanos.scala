package LiskovSubstitution.GoodWay

import scala.util.Try

trait ITramitesHumano
{
    protected var _direccion : String = _

    def cambiarDireccion(nuevaDireccion: String) : Try[Unit]
}