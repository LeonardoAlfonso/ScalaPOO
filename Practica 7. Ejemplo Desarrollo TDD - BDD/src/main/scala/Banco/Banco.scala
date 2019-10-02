package Banco

import Cuentas._
import ServiciosExternos._
import scala.util.Random

// class Banco extends IBanco
class Banco(servicioCentralRiesgo : ICentralRiesgo) extends IBanco
{
    //Atributos
    private var _servicioCentralRiesgo : ICentralRiesgo = servicioCentralRiesgo
    //private var _servicioCentralRiesgo : ICentralRiesgo = new ServiciosExternos

    //Métodos
    def aprobarCheque(cuenta : ICuenta, valor : Double) : Option[String] =
    {
        var aprobacion : Option[String] = None

        if(cuenta.saldo >= valor)
        {
            var puntaje : Option[Int] = _servicioCentralRiesgo.consultarPuntaje(cuenta)

            if(!puntaje.isEmpty)
            {
                if (puntaje.get > 400)
                    aprobacion = Some(Random.alphanumeric take 10 mkString)
            }
        }

        return aprobacion
    }

    def generarCheque(codigoAprobacion : String) : Option[Cheque] =
    {
        return Option(new Cheque);
    }

    //def crearCuena()
}