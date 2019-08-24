package Ejemplos

class Mapa(pais: String) extends Serializable
{
    //Atributos
    private val _nombrePais : String = pais

    //Getters
    def nombrePais = _nombrePais

    override def toString = "Objeto Mapa: " + _nombrePais
}