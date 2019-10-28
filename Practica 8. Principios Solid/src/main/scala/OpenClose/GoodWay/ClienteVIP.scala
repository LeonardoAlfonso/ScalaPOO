package OpenClose.GoodWay

import scala.util.Try

class ClienteVIP extends Cliente
{
    def incrementarPuntos(valorCompra : Double) : Try[Double] =
    {
        Try({
            _puntos = _puntos + (valorCompra / 500)
            _puntos
        })
    }
}