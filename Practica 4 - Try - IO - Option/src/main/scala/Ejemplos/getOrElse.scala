package Ejemplos

object getOrElse extends App
{
    var paises : Map[String, Mapa] = 
                 Map("Colombia" -> new Mapa("Colombia"), "Peru" -> new Mapa("Peru"))

    var peru : Mapa = paises.get("Peru").getOrElse(new Mapa("Inexistente"))
    var italia : Mapa = paises.get("Italia").getOrElse(new Mapa("Inexistente"))
    println(peru.nombrePais)
    println(italia.nombrePais)
}