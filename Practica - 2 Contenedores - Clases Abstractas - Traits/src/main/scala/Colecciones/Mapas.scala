package Colecciones

object Mapas {
  def main(args : Array[String]) : Unit = {
    
     //Productos    
        val cebolla : Producto = new Producto("Cebolla", 500)
        val brocoli : Producto = new Producto("Brocoli", 2000) 
        val arroz : Producto = new Producto("Arroz", 2000)
        val pollo : Producto = new Producto("Pollo", 10000)
        val pescado : Producto = new Producto("Pescado", 50000)
        val carne : Producto = new Producto("Carne", 9000)
    
    //Mapas
     var listado1 : Map[String,Producto] = Map()
     listado1 += ("Cebolla" -> cebolla, "Arroz" -> arroz)
     //println(listado1)
     //println(listado1.get("Cebolla"))
     //listado1 = listado1.-("Arroz")
     //listado1 -= ("Arroz")
     //println(listado1)
     //println(listado1.isEmpty)
     /*println(listado1.contains("Cebolla"))
     var listado2 = Map("Cebolla" -> cebolla, "Arroz" -> arroz, "Carne" -> carne)
     this.iterar(listado2)  */

     var listado2 = Map("Cebolla" -> cebolla, "Arroz" -> arroz, "Carne" -> carne)
     //listado2 = listado1.++(listado2)
     listado2 = listado1 ++ listado2
     this.iterar(listado2)

  } 
  
      def iterar(map : Map[String,Producto]) : Unit = 
        {
           map.keys.foreach{ i =>  
           print( "Key = " + i )
           println(" Value = " + map(i) )}
        }
}