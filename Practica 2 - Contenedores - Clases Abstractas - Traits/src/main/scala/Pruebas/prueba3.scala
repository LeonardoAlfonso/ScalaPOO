package Pruebas

import ComidaRapida._

object prueba3 {
    def main(args: Array[String]) {
        
        //Prueba1
         var caja : Caja = new Caja
         mostrarCatalogo()
         agregarComida(1)
         println("El precio total es " + caja.comprar)
         
       //Metodos auxiliares
         def mostrarCatalogo() : Unit = 
         {
             var contador = 0
             caja.mostrarCatalogo().foreach
             {
                 e=>
                   {
                       contador = contador + 1
                       println(contador + ") " + e.tipo + " " + e.sabor)
                   }
             }
         }
         
         def agregarComida(alimento : Int) : Unit =
         {
            alimento match 
            {
                case 1  => caja.agregarElemento(caja.mostrarCatalogo()(0))
                case 2 => caja.agregarElemento(caja.mostrarCatalogo()(1))
                case 3 => caja.agregarElemento(caja.mostrarCatalogo()(2))
            }
         }
    }
}