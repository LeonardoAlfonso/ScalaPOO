package ComidaRapida

class Papas (tamano: Double) extends Alimentos
{
      //Atributos
      var _sabor = "Saladas"
      var _tamano = tamano
      var _porcentajeConsumido  = 0
      var _costo = 4000
      var _tipo = "Papas"
      private var _salsas = new Array[String](3)
      private var _tieneQueso : Boolean = false
      
      //Métodos
        //Getters
        def tieneQueso = _tieneQueso
        
        //Setters
        def tieneQueso_() = _tieneQueso = !_tieneQueso
        
        //Acciones
        def getCosto() : Double =
        {
            return _costo * _tamano 
        }
}