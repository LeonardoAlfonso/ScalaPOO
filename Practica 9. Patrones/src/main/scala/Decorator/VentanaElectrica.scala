package Decorator

class VentanaElectrica(nuevoCarro : AbstractCarro) extends CarroDecorator(nuevoCarro)
{
    //Atributos
    var _costoInicial = 500
}