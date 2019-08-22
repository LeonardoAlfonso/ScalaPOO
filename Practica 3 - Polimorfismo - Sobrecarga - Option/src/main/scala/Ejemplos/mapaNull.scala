package Ejemplos

object MapaNull extends App
{
    var paises : Map[String, Mapa] = 
                 Map("Colombia" -> new Mapa("Colombia"), "Peru" -> new Mapa("Peru"))

    println(paises.get("Colombia"))
    println(paises.get("Francia"))
}