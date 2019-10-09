package Decorator

class CajaCambiosAuto(nuevoCarro : AbstractCarro) extends CarroDecorator(nuevoCarro)
{
    //Atributos
    var _costoInicial = 1500
}