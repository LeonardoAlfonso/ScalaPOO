class Hamburguesa(precioH : Double)
{
    private var _precio : Double = precioH
    private var _ingredientes : List[String] = List()

    def ingredientes = _ingredientes

    def calcularPrecio() : Double = 
    {
        var iterator : Iterator[String] = _ingredientes.iterator
        var ingredienteActual : String = ""
        
        while(iterator.hasNext)
        {
            ingredienteActual = iterator.next()
            _precio = _precio + 2000;
        }

        return _precio
    }

    def agregarIngrediente(ingredienteNuevo : String) : Unit =
    {
        _ingredientes = _ingredientes ::: List(ingredienteNuevo)
    }
}