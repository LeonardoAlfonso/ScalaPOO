package cine

class Funcion(horarioInicial: String, capacidadInicial: Int)
{
    //Atributos
    private var _horario : String = horarioInicial
    private var _capacidad : Int = capacidadInicial

    //Metodos
    def horario = _horario
    def capacidad = _capacidad
}