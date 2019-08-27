package ComidaRapida

import scala.util.Try

class Bebida extends Alimentos
{
      //Atributos
      var _sabor = ""
      var _tamano = 0.0d
      var _costo = 0.0d
      var _tipo = "Bebida"
      private var _temperatura : Double = _

      //Constructores      
      
      //Métodos
        //Getters
        def temperatura = _temperatura

        //Setters
        def temperatura_(nuevaTemperatura : String) : Try[Unit] = 
        {
            Try(_temperatura = nuevaTemperatura.toDouble)
        }
        
        //Acciones
        def getCostoProducto() : Double =
        {
            return _costo * _tamano 
        }
}