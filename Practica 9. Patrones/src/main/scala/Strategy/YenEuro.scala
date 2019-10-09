package Strategy

class YenEuro extends ICambioMoneda
{
    //Métodos
    def realizarCambio(moneda : Double) : Double =
    {
        val transformacion : Double = moneda / 0.0085
        return transformacion
    }
}