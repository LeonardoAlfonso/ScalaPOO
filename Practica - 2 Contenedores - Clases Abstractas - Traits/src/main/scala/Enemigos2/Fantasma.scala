package Enemigos2

class Fantasma(nivelJugador : Int) extends Enemigo(nivelJugador) with AccionesAire
{
      //Inicializar
      var _poder = 420
      
      //Implementación métodos
      def atacar() : Double = 
      {
           return this._poder * 12
      }
      
      def caminar(distancia : Double) : Double = 
      {
           return 0
      }
      
      override def superAtaque() : Double =
      {
          return (5 * super.superAtaque()) / 2
      }
      
      def volar(distancia : Double) : Double = 
      {
           return this._poder/distancia
      } 
}