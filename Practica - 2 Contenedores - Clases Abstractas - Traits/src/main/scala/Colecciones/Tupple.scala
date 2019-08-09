package Colecciones

object Tupple {
  def main(args : Array[String]) : Unit = {
      //Productos
        val cebolla : Producto = new Producto("Cebolla", 500)
        val brocoli : Producto = new Producto("Brocoli", 2000) 
        val arroz : Producto = new Producto("Arroz", 2000)
        val pollo : Producto = new Producto("Pollo", 10000)
        val pescado : Producto = new Producto("Pescado", 50000)
        val carne : Producto = new Producto("Carne", 9000)
    
        //Inicialización
        val referencias = new Tuple3(1, cebolla, 55)
        println(referencias)

        referencias.productIterator.foreach{ p =>println("Value = " + p )}
        
  }
}