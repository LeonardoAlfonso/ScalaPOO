package Ejemplos

object patternMatching2 extends App{
    var paises : Map[String, Mapa] = 
                 Map("Colombia" -> new Mapa("Colombia"), "Peru" -> new Mapa("Peru"))

    var peru : Option[Mapa] = paises.get("Peru")
    var italia : Option[Mapa] = paises.get("Italia")
    println(nombrePais(peru))
    println(nombrePais(italia))

    def nombrePais(mapa: Option[Mapa]) = mapa match
    {
        case Some(s) => s.nombrePais
        case None => "El pais no existe"
    }
}

