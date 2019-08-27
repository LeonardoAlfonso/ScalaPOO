package ComidaRapida

import scala.util.Try

class EmpaquePlastico extends InsumoCocina
{
     //Atributos  
      var _costo = 500
      
    //Métodos
      def getCostoProducto() : Double =
      {
          return _costo
      }
}