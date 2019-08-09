package ComidaRapida

abstract class Alimentos extends InsumoCocina
{
    //Atributos
      protected var _sabor: String  
      protected var _tamano : Double 
      protected var _porcentajeConsumido : Double 
      protected var _tipo : String
      
    //Métodos
        //Getters
        def sabor = _sabor
        def tamano = _tamano
        def porcentajeConsumido = _porcentajeConsumido
        def tipo = _tipo
        
        //Setters
        def sabor_(saborAlimento : String) = _sabor = saborAlimento
        def tamano(tamanoAlimento : Double) = _tamano = tamanoAlimento
        
        //Acciones
        def consumirAlimentos(mordiscos : Int) : Double = 
        {
            _porcentajeConsumido = _tamano - (mordiscos/100)
            return _porcentajeConsumido
        }
}