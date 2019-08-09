package Enemigos2

class TortugaVoladora extends Tortuga with AccionesAire
{
      def volar(distancia : Double) : Double = 
      {
           return this._poder/(3*distancia)
      } 
}