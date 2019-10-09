package Strategy

class DolarPeso extends ICambioMoneda
{
    //Métodos
    def realizarCambio(moneda : Double) : Double =
    {
        val transformacion : Double = moneda * 3800
        return transformacion
    }
}