package Pruebas

import Enemigos2._

object prueba2 extends App{
        
        //Prueba 1
        var tortuga1 : Tortuga = new Tortuga
        println("\nPRUEBA1 :")
        println("nadar: " + tortuga1.nadar(45))
        
        //Prueba2
        var fantasma : Fantasma = new Fantasma(34)
        println("\nPRUEBA 2:")
        println("volar: " + fantasma.volar(55))

        //Prueba3
        var tortugaVoladora : TortugaVoladora = new TortugaVoladora
        println("\nPRUEBA3 :")
        println("vida: " + tortugaVoladora.vida)
        println("poder: " + tortugaVoladora.poder)
        println("nivel jugador: " + tortugaVoladora.nivel)
        println("caminar: " + tortugaVoladora.caminar(25))
        println("atacar: " + tortugaVoladora.atacar())
        println("superAtaque: " + tortugaVoladora.superAtaque())
        println("nadar: " + tortugaVoladora.nadar(45))
        println("volar: " + tortugaVoladora.volar(55))
}