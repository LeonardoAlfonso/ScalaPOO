package ComidaRapida

import scala.util.Try

class Hamburguesa extends Alimentos
{
    //Atributos
    var _sabor = ""
    var _costo = 0.0d
    var _tamano = 0.0d
    var _tipo = "Hamburguesa"
    
    //Métodos
    def getCostoProducto() : Double =
    {
        return _costo  
    }
}