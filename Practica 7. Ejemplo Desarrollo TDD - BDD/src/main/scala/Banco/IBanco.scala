package Banco

import Cuentas._

trait IBanco
{
    //Atributos

    //Métodos
    def aprobarCheque(cuenta : ICuenta, valor : Double) : Option[String]
    def generarCheque(codigoAprobacion : String) : Option[Cheque]
}