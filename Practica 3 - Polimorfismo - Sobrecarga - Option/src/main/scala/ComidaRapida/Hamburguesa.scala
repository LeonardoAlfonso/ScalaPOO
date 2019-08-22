package ComidaRapida

class Hamburguesa(sabor: String, precio: Double, tamano: Double) extends Alimentos
{
      //Atributos
      var _sabor = sabor
      var _porcentajeConsumido = 0
      var _costo = precio
      var _tamano = tamano
      var _tipo = "Hamburguesa"
      private var _salsas = new Array[String](3)
      
      //Métodos
      def aplicarSalsas(salsa : String) : Boolean = 
      {
          var contadorSalsas: Int = this.contadorSalsas()  
       
          if (contadorSalsas < 3)
          {
              _salsas(contadorSalsas) = salsa
              return true
          }
          else
              return false
      }
      
      def getCosto() : Double =
      {
          return _costo  
      }
      
      private def contadorSalsas() : Int = 
      {
          var contadorSalsas : Int = 0
          
          _salsas.foreach
          {
              e=>
                {
                    if(e.isInstanceOf[String])
                      contadorSalsas = contadorSalsas + 1
                }
          }
          
          return contadorSalsas
      }
}