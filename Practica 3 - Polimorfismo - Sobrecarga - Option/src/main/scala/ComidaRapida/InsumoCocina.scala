package ComidaRapida

import scala.util.Random
import scala.util.Try

trait InsumoCocina 
{
    //Atributos  
      protected var _costo : Double
      protected var _codigo : Int = Random.nextInt(99999999)
      
    //Métodos
      def getCostoProducto() : Double
      def costo_(nuevoCosto : String) : Try[Unit] = 
      {
          Try(_costo = nuevoCosto.toDouble)
      }
      def codigo = _codigo 
}