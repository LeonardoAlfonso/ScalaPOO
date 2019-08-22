package Polimorfismo2

class Enemigo
{
      //Atributos
      protected var _vida : Double = 100
      protected var _poder : Double = 200
      protected var _resistenciaAgua : Double = 0
      protected var _resistenciaFuego : Double = 80
      protected var _resistenciaHierba : Double = 50
 
      //Métodos
      
        //Getters
        
        def vida = _vida
        def poder = _poder
        def resistenciaAgua = _resistenciaAgua
        def resistenciaFuego = _resistenciaFuego
        def resistenciaHierba = _resistenciaHierba
        
        //Setters
        
        def vida_ (vida : Double) = _vida = vida
        def poder_(poder : Double) = _poder = poder
        def resistenciaAgua_(resistencia : Double) = _resistenciaAgua = resistencia
        def resistenciaFuego_(resistencia : Double) = _resistenciaFuego = resistencia
        def resistenciaHierba_(resistencia : Double) = _resistenciaHierba = resistencia
        
        //Acciones
        def recibirAtaque(fuego: Fuego) : Double =
        {
            _vida = _vida - _resistenciaFuego/fuego.poder
            return _vida
        }

        def recibirAtaque(agua: Agua, potenciador: Double) : Double =
        {
            _vida = _vida - agua.poder * potenciador
            return _vida
        }

        def recibirAtaque(hierba: Hierba) : Double =
        {
            _vida = _vida - _resistenciaHierba/hierba.poder
            return _vida
        }
}