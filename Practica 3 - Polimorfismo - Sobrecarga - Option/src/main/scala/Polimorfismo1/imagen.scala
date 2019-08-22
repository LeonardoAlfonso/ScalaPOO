package Polimorfismo1

import java.util._

class Imagen(peso: Double) extends Archivo
{
    //Atributos
    var _extension = ".png"
    var _peso = peso

    //Metodos
    override def contenido_(nuevoContenido : String) : Unit =
    {
        _contenido = Base64.getEncoder.encodeToString(nuevoContenido.getBytes("UTF-8"))
    }
}