package Ejemplos

object empty {
   def main(args: Array[String]) {
    var paises : Map[String, Mapa] = 
                 Map("Colombia" -> new Mapa("Colombia"), "Peru" -> new Mapa("Peru"))

    var peru : Option[Mapa] = paises.get("Peru")
    var italia : Option[Mapa] = paises.get("Italia")

      if(!peru.isEmpty)
      {
          println(peru.get.nombrePais + " No esta vacio")
      }

      if(italia.isEmpty)
      {
        println("Esta vacio")
      }
   }
}