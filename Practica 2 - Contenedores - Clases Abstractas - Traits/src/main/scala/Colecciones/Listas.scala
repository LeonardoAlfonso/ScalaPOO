package Colecciones

object Listas 
{
  def main(args : Array[String]) : Unit = {
    //Inicialización de listas
        //Directamente
        var listaCarnes : List[Producto] = List(new Producto("Pollo", 10000), new Producto("Pescado", 50000), new Producto("Carne", 9000))
        
        //println(listaCarnes) //Impresión 
        
        // listaCarnes.foreach{
        //      e=>
        //       {
        //           println(e.nombreProducto)
        //       }
        // }
    //this.iterar(listaCarnes)
        
        //Por medio de concetenación
        val cebolla : Producto = new Producto("Cebolla", 500)
        val brocoli : Producto = new Producto("Brocoli", 2000) 
        val listaVerduras : List[Producto] = cebolla :: brocoli :: Nil
        //println(listaVerduras.apply(0).nombreProducto)
        
//         //Doble concatenación
         //val mercadoPlaza : List[Producto] = listaCarnes ::: listaVerduras
        //this.iterar(mercadoPlaza)
//         //Fill
        // val arroz : Producto = new Producto("Arroz", 2000)
        // val mercadoTienda : List[Producto] =  List.fill(3)(arroz)
       //this.iterar(mercadoTienda)  
//         //Tabulate
        val raicesCuadradas = List.tabulate(6)(n => n * n)
        println( "Raices Cuadradadas : " + raicesCuadradas  )
//   }
  }
  def iterar(list : List[Producto]) : Unit = 
        {
            var iterator : Iterator[Producto] = list.iterator
            var productoActual : Producto = null
            
            while(iterator.hasNext)
            {
                productoActual = iterator.next()
                println(productoActual.nombre + " " + productoActual.precio)
            }
        }
  
        
}  