package Ejemplos

class Pais
{
    //Atributos
    //private var _nombrePais : Option[String] = None
    private var _nombrePais : String = _

    //Getters
    // def nombrePais = _nombrePais match
    // {
    //     case Some(s) => s
    //     case None => "El pais no tiene nombre"
    // }
    def nombrePais = _nombrePais

    //Setter
    //def nombrePais_(nombre: String) = _nombrePais = Option(nombre)
    def nombrePais_(nombre: String) = _nombrePais = nombre
}

object getterOption extends App{
    var pais : Pais = new Pais
    println(pais.nombrePais)
    pais.nombrePais_("Colombia")
    println(pais.nombrePais)
}