package Pruebas

import SobrecargaOperadores._

object prueba3 {
  def main(args : Array[String]) : Unit = {
       var a = new Complejo(8.0,5.0)
       var b = new Complejo(7.0,3.0)
       println(a)
       println(a + b)
       println(a - b)
  }
}