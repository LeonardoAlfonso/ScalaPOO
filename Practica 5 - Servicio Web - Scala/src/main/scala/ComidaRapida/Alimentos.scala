package ComidaRapida

import scala.util.Random
import scala.util.Try
import scala.util.Failure

abstract class Alimentos extends InsumoCocina with Serializable
{
    //Atributos
      protected var _sabor: String  
      protected var _tamano : Double 
      protected var _tipo : String      
      
    //Métodos
        //Getters
        def sabor = _sabor
        def tamano = _tamano
        def tipo = _tipo
        
        //Setters
        def sabor_(saborAlimento : String) : Try[Unit] =
        { 
            var resultado : Try[Unit] = null

            if (!saborAlimento.isEmpty)
            {
                resultado = Try(_sabor = saborAlimento)
            }
            else
            {
                resultado = Failure(new Exception())
            }
            return resultado
        }
        def tamano_(nuevoTamano : String) : Try[Unit] = 
        {
            Try(_tamano = nuevoTamano.toDouble)
        }
}