package ServiciosExternos

import Cuentas._

trait ICentralRiesgo
{
    //Métodos
    def consultarPuntaje(cuenta : ICuenta) : Option[Int]
}