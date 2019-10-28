package OpenClose.GoodWay

import scala.util.Try

class ClienteEstandar extends Cliente
{
    def incrementarPuntos(valorCompra : Double) : Try[Double] =
    {
        Try({
            _puntos = _puntos + (valorCompra / 1000)
            _puntos
        })
    }
}