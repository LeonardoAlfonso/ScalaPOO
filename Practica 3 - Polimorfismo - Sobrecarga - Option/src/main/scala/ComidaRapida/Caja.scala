package ComidaRapida

class Caja 
{
    //Atributos
    private var _listaPedidos : List[InsumoCocina] = List()
    private var _catalogo : Set[Alimentos] = Set()
    
    //Inicialización
    
    //Metodos
    def poblarCatalogo(alimento : Alimentos) : Unit =
    {
        _catalogo = _catalogo + alimento
    }
    
    def mostrarCatalogo() : Unit = 
    {
        var iterator : Iterator[Alimentos] = _catalogo.iterator
        var alimentoActual : Alimentos = null
            
            while(iterator.hasNext)
            {
                alimentoActual = iterator.next()
                println(alimentoActual.tipo + " " + alimentoActual.sabor + " " + alimentoActual.getCosto())
            }
    }

    // def agregarElemento(elemento : InsumoCocina) : Unit =
    // {
    //     _catalogo(_indiceElemento) = elemento
    //     _indiceElemento = _indiceElemento + 1;
    // }
    
    // def comprar() : Double = 
    // {
    //    var precio : Double = 0
    //    val scanner = new java.util.Scanner(System.in)
       
    //     _listaPedidos.foreach
    //     {
    //         e=>
    //           {
    //               if(e.isInstanceOf[InsumoCocina])
    //                 precio = precio + e.getCosto()
    //           }
    //     }
       
    //    println("Desea el pedido para llevar?")
    //    if(scanner.nextLine() == "Si")
    //    {
    //        precio = precio + new EmpaquePlastico().getCosto 
    //    }
       
    //    return precio;
    // }    
}