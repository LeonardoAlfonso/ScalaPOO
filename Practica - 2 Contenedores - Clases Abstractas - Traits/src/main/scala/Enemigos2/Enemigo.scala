package Enemigos2

abstract class Enemigo(nivelJugador : Int) 
{
      //Atributos
      protected var _vida : Double = 100  //Valor Concreto
      protected var _poder : Double //Valor Abtracto
      protected var _nivel : Int = nivelJugador //Valor Concreto
 
      //Métodos
      
        //Getters
        
        def vida = _vida
        def poder = _poder
        def nivel = _nivel
        
        //Setters
        
        def vida_ (vida : Double) = _vida = vida
        def poder_(poder : Double) = _poder = poder
        def nivel_(nivel : Int) = _nivel = nivel
        
        //Acciones
        def atacar() : Double  //Método Abstracto
        def caminar(distancia : Double) : Double //Método Abstracto
        def superAtaque() : Double = //Método Concreto
        {
            return _poder * 8 + _nivel
        }      
}