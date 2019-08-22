package Pruebas

import Polimorfismo2._

object prueba4 extends App{
    var enemigo : Enemigo = new Enemigo
    var ataqueFuego : Fuego = new Fuego
    var ataqueAgua : Agua = new Agua
    var ataqueHierba : Hierba = new Hierba

    println(enemigo.recibirAtaque(ataqueFuego))
    println(enemigo.recibirAtaque(ataqueAgua, 1.5))
    println(enemigo.recibirAtaque(ataqueHierba))
}