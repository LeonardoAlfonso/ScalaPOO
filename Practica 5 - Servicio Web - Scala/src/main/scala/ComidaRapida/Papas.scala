package ComidaRapida

import scala.util.Try

class Papas extends Alimentos
{
      //Atributos
      var _sabor = ""
      var _tamano = 0.0d
      var _costo = 0.0d
      var _tipo = "Papas"
      private var _tieneQueso : Boolean = false
      
      //Métodos
        //Getters
        def tieneQueso = _tieneQueso
        
        //Setters
        def tieneQueso_() = _tieneQueso = !_tieneQueso
        
        //Acciones
        def getCostoProducto() : Double =
        {
            var costoTotal : Double = _costo * _tamano
            costoTotal = if (_tieneQueso) costoTotal + 500 else costoTotal
            return costoTotal
        }
}