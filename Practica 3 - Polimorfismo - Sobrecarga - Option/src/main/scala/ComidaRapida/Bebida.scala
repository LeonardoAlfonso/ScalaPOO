package ComidaRapida

class Bebida(sabor: String, tamano: Double) extends Alimentos
{
      //Atributos
      var _sabor = sabor
      var _tamano = tamano
      var _porcentajeConsumido = 0
      var _costo = 5000
      var _tipo = "Bebida"
      private var _temperatura = sabor
      
      //Métodos
        //Getters
        def temperatura = _temperatura
        
        //Acciones
        def getCosto() : Double =
        {
            return _costo * _tamano 
        }
}