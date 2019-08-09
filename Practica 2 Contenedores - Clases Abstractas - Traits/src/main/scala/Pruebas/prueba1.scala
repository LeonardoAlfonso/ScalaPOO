package Pruebas

import Enemigos._

object prueba1 extends App{
    
    //Prueba 1
    var tortuga1 : Enemigo = new Tortuga
    println("\nPRUEBA1 :")
    println("vida: " + tortuga1.vida)
    println("poder: " + tortuga1.poder)
    println("nivel jugador: " + tortuga1.nivel)
    println("caminar: " + tortuga1.caminar(25))
    println("atacar: " + tortuga1.atacar())
    println("superAtaque: " + tortuga1.superAtaque())
    
    //Prueba2
    var tortuga2 : Tortuga = new Tortuga
    println("\nPRUEBA 2:")
    println("vida: " + tortuga2.vida)
    println("poder: " + tortuga2.poder)
    println("nivel jugador: " + tortuga2.nivel)
    println("caminar: " + tortuga2.caminar(25))
    println("atacar: " + tortuga2.atacar())
    println("superAtaque: " + tortuga2.superAtaque())
    
    //Prueba3
    var hongo1 : Enemigo = new Hongo(12)
    println("\nPRUEBA3 :")
    println("vida: " + hongo1.vida)
    println("poder: " + hongo1.poder)
    println("nivel jugador: " + hongo1.nivel)
    println("caminar: " + hongo1.caminar(25))
    println("atacar: " + hongo1.atacar())
    println("superAtaque: " + hongo1.superAtaque())
    
    //Prueba4
    var hongo2 : Hongo = new Hongo(12)
    println("\nPRUEBA4 :")
    println("vida: " + hongo2.vida)
    println("poder: " + hongo2.poder)
    println("nivel jugador: " + hongo2.nivel)
    println("caminar: " + hongo2.caminar(25))
    println("atacar: " + hongo2.atacar())
    println("superAtaque: " + hongo2.superAtaque())
}