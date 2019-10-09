package Decorator

abstract class CarroDecorator(nuevoCarro : AbstractCarro) extends AbstractCarro
{
    //Atributos
    protected var _carro : AbstractCarro = nuevoCarro

    //Métodos
    override def getCosto() : Double =
    {
        var costoFinal = _carro.getCosto() + _costoInicial
        return costoFinal
    }
}