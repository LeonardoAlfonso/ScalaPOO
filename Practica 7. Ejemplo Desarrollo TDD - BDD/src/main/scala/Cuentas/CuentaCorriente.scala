package Cuentas

import Banco._
import scala.util.Try

class CuentaCorriente extends ICuenta
{
    //Atributos
    private var _tieneSobregiro : Boolean = false
    private var _cupoSobregiro : Double = _

    //Métodos
    def tieneSobregiro = _tieneSobregiro
    def tieneSobregiro_= (tieneSobregiro : Boolean) = _tieneSobregiro = tieneSobregiro

    def cupoSobregiro : Option[Double] = 
    {
        return if (_tieneSobregiro) Some(_cupoSobregiro) else None
    }
   
    def cupoSobregiro_= (cupoSobregiro : Double) : Try[Unit] =
    {
        Try({
            if (_tieneSobregiro)
                _cupoSobregiro = cupoSobregiro
            else
                throw new Exception("No se puede dar cupo sin aprobar el sobregiro")
        })
    }
    
    def crearCheque(banco: IBanco, valor: Double) : Option[Cheque] =
    {
        var cheque : Option[Cheque] = None
        var aprobacionCheque : Option[String] = banco.aprobarCheque(this, valor)

        if(!aprobacionCheque.isEmpty)
        {
            cheque = banco.generarCheque(aprobacionCheque.get)
        }

        return cheque
    }
} 