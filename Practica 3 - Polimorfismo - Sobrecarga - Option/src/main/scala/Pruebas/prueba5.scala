package Pruebas

import ComidaRapida._

object prueba5 {
    def main(args: Array[String]) {
        
        //Prueba1
         var caja : Caja = new Caja

        //Inicializar Caja
        caja.poblarCatalogo(new Hamburguesa("Sencilla", 12000, 125))
        caja.poblarCatalogo(new Hamburguesa("Doble", 15000, 250))
        caja.poblarCatalogo(new Hamburguesa("Ranchera", 14000, 175))
        caja.poblarCatalogo(new Hamburguesa("TodoTerreno", 20000, 350))

        caja.mostrarCatalogo()
    //      agregarComida(1)
    //      println("El precio total es " + caja.comprar)
         
    //    //Metodos auxiliares
    //      def mostrarCatalogo() : Unit = 
    //      {
    //          var contador = 0
    //          caja.mostrarCatalogo().foreach
    //          {
    //              e=>
    //                {
    //                    contador = contador + 1
    //                    println(contador + ") " + e.tipo + " " + e.sabor)
    //                }
    //          }
    //      }
         
    //      def agregarComida(alimento : Int) : Unit =
    //      {
    //         alimento match 
    //         {
    //             case 1  => caja.agregarElemento(caja.mostrarCatalogo()(0))
    //             case 2 => caja.agregarElemento(caja.mostrarCatalogo()(1))
    //             case 3 => caja.agregarElemento(caja.mostrarCatalogo()(2))
    //         }
    //      }
    }
}