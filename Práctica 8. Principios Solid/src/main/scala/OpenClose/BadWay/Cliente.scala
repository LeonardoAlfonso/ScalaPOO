package OpenClose.BadWay

import scala.util.Try

class Cliente
{
    private var _tipoSuscripcion : String = "Estandar"
    private var _nombre : String = _
    private var _puntos : Double = 0d

    def tipoSuscripcion = _tipoSuscripcion
    def nombre = _nombre 
    def puntos = _puntos

    //Setters
    def tipoSuscripcion_= (suscripcion : String) : Try[Unit] = Try(_tipoSuscripcion = suscripcion)
    def nombre_= (nombreCliente : String) : Try[Unit] = Try(_nombre = nombreCliente)

    def incrementarPuntos(valorCompra : Double) : Try[Double] = 
    {
        Try({
            if (_tipoSuscripcion == "Estandar")
            {
                _puntos = _puntos + (valorCompra / 1000) 
            }
            else if (_tipoSuscripcion == "VIP")
            {
                _puntos = _puntos + (valorCompra / 500) 
            }
            _puntos
        })
    }
}