package Enemigos2

class Tortuga extends Enemigo(5) with AccionesAgua
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
      
      def nadar(distancia : Double) : Double = 
      {
           return (3*distancia)/this._poder 
      }
}