package Entidades

class Identificacion(id: Double, tipo : String)
{
    //Atributos
    private var _identificacion : Double = id
    private var _tipoIdentificacion : String = tipo
    
    //Métodos
    def identificacion = _identificacion
    def tipoIdentificacion = _tipoIdentificacion
}