package Strategy

class CasaCambioContext
{
    //Atributos
    private var _strategy : ICambioMoneda = _

    //Métodos
    def strategy_(s : ICambioMoneda) = _strategy = s
    def consultarCambio(moneda: Double) : Double =
    {
        return _strategy.realizarCambio(moneda)
    }
}