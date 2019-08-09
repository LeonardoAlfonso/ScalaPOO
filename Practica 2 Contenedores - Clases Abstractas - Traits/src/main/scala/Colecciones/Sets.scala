package Colecciones

//import scala.collection.mutable.Set

object Sets {
    def main(args : Array[String]) : Unit = {
      //Productos
        val cebolla : Producto = new Producto("Cebolla", 500)
        val brocoli : Producto = new Producto("Brocoli", 2000) 
        val arroz : Producto = new Producto("Arroz", 2000)
        val pollo : Producto = new Producto("Pollo", 10000)
        val pescado : Producto = new Producto("Pescado", 50000)
        val carne : Producto = new Producto("Carne", 9000)
      
      //Inicialización de sets
        val productos : Set[String] = Set("arroz", "manzana", "pera")
        val productos2 : Set[String] = Set("arroz", "manzana", "pera", "arroz")
        var productos3 : Set[Producto] = Set(cebolla, brocoli, arroz)
        var productos4 : Set[Producto] = Set(cebolla, brocoli, arroz, cebolla)
        this.iterar(productos4)
        /*println(productos)
        println(productos2)
        println(productos3)
        println(productos4)*/
        
      //Elementos
        var productos5 : Set[Producto] = Set(carne, pescado, pollo)
        //println(productos5)
        productos5 =  productos5 + arroz //.+()
        //println(productos5)
        productos5 = productos5.-(pescado)
        //println(productos5)
  
        
        var productos6 : Set[Producto] = productos5 ++ productos4
        //println(productos6)
    }
    
        def iterar(set : Set[Producto]) : Unit = 
        {
            var iterator : Iterator[Producto] = set.iterator
            var productoActual : Producto = null
            
            while(iterator.hasNext)
            {
                productoActual = iterator.next()
                println(productoActual.nombre + " " + productoActual.precio)
            }
        }
}