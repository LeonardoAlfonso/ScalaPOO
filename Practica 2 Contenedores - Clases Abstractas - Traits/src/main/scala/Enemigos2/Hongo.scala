package Enemigos2

class Hongo(nivelJugador : Int) extends Enemigo(nivelJugador)
{
      //Inicializar
      var _poder = 260
      
      //Implementación métodos
      def atacar() : Double = 
      {
           return this._poder * 25
      }
      
      def caminar(distancia : Double) : Double = 
      {
           return distancia/(2 * this._poder) 
      }
      
      override def superAtaque() : Double =
      {
          return super.superAtaque() / 2
      }
}