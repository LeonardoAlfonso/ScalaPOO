package Enemigos

class Tortuga extends Enemigo(5)
{
      //Inicializar
      var _poder = 520
      
      //Implementación métodos
      def atacar() : Double = 
      {
           return this._poder * 45
      }
      
      def caminar(distancia : Double) : Double = 
      {
           return distancia/this._poder 
      }
}