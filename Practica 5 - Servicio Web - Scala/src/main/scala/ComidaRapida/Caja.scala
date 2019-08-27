package ComidaRapida

import scala.util._

class Caja 
{
    //Atributos
    private var _listaPedidos : List[InsumoCocina] = List()
    private var _catalogo : Set[Alimentos] = Set()
    private var _listaAcciones : Set[String] = Set()
    
    //Inicialización
    
    //Metodos
    //Administrativo

    def poblarCatalogo() : Unit =
    {
        var configuracion : Boolean = true
        while (configuracion)
        {
            crearAlimentos
            var continuar : String = readLine("Desea agregar mas productos? Digite 1 para continuar: ")

            if (!"1".equals(continuar)) configuracion = false
            
        }
    }

    private def crearAlimentos() : Unit =
    {
        println("Se pueden crear los siguientes productos: \n1. Hamburguesa, \n2. Bebidas, \n3. Papas")
        println("Que tipo de producto desea crear?")
        var opcion : String = readLine()
        var producto : Option[Alimentos] = opcion match
        {
            case "1" => Some(new Hamburguesa)
            case "2" => Some(new Bebida)
            case "3" => Some(new Papas)
            case _ => None       
        }

        if (!producto.isEmpty)
        {
            println("Por favor escriba las caracteristicas de su " + producto.get.tipo)
            var sabor : String = readLine("Escriba el sabor: ")
            var tamano : String = readLine("Escriba el tamano: ")
            var costo : String = readLine("Escriba el costo: ")            
            var resultadoCosto : Boolean = producto.get.costo_(costo).isSuccess
            var resultadoTamano : Boolean = producto.get.tamano_(tamano).isSuccess
            var resultadoSabor : Boolean = producto.get.sabor_(sabor).isSuccess

            if (resultadoTamano && resultadoCosto && resultadoSabor) 
            {
                _catalogo = _catalogo + producto.get
                println(producto.get.tipo + " sabor a: " + producto.get.sabor + " agregado al catalogo")
            }
            else
            {
                println("Los campos ingresados no son correctos")
            }
        }
        else
        {
            println("El producto no existe")
        }
    }
    
    def mostrarCatalogo() : Unit = 
    {
        var listaCatalogo : Option[Set[Alimentos]] = None

        if (!_catalogo.isEmpty) 
        {
            listaCatalogo = Some(_catalogo) 
        }

        listaCatalogo match 
        {
            case Some(s) => 
            {
                var iterator : Iterator[Alimentos] = _catalogo.iterator
                var alimentoActual : Alimentos = null

                while(iterator.hasNext)
                {
                    alimentoActual = iterator.next()
                    println(alimentoActual.tipo + " " + alimentoActual.sabor)
                }
            }
            case None => println("El catalogo esta vacio")
        }
    }

    //Metodos Internos
    //private def opcionesCaja : 

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