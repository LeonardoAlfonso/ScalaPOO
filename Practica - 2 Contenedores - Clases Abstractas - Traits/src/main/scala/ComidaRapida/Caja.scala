package ComidaRapida

class Caja 
{
    //Atributos
    private var _listaPedidos = new Array[InsumoCocina](10)
    private var _catalogo = new Array[Alimentos](3)
    private var _indiceElemento : Int = 0
    
    //Inicialización
      _catalogo(0) = new Hamburguesa("Asada", 3/4)
      _catalogo(1) = new Bebida("Coca Cola", 1)
      _catalogo(2) = new Papas(3)
    
    //Metodos
    def agregarElemento(elemento : InsumoCocina) : Unit =
    {
        _listaPedidos(_indiceElemento) = elemento
        _indiceElemento = _indiceElemento + 1;
    }
    
    def mostrarCatalogo() : Array[Alimentos] = 
    {
        return _catalogo
    }
    
    def comprar() : Double = 
    {
       var precio : Double = 0
       val scanner = new java.util.Scanner(System.in)
       
        _listaPedidos.foreach
        {
            e=>
              {
                  if(e.isInstanceOf[InsumoCocina])
                    precio = precio + e.getCosto()
              }
        }
       
       println("Desea el pedido para llevar?")
       if(scanner.nextLine() == "Si")
       {
           precio = precio + new EmpaquePlastico().getCosto 
       }
       
       return precio;
    }    
}