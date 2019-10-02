package OpenClose.GoodWay

import scala.util.Try

abstract class Cliente
{
    protected var _tipoSuscripcion : String = "Estandar"
    protected var _nombre : String = _
    protected var _puntos : Double = 0d

    def tipoSuscripcion = _tipoSuscripcion
    def nombre = _nombre 
    def puntos = _puntos

    //Setters
    def tipoSuscripcion_= (suscripcion : String) : Try[Unit] = Try(_tipoSuscripcion = suscripcion)
    def nombre_= (nombreCliente : String) : Try[Unit] = Try(_nombre = nombreCliente)

    def incrementarPuntos(valorCompra : Double) : Try[Double]
}