package Ejemplos

import scala.io.Source
import java.io._

object fileIOSerealizable {
   def main(args: Array[String]) {
        //Crear Archivo
        var path : String = "ExampleFile2.txt" //Empieza en la raiz del proyecto. 
                                              //Se recomieda ubicarlo dentro de la aplicación en un paquete para archivos
        var pais : Mapa = new Mapa("Argentina") //La clase Mapa extiende del trait Serealizable (revisar)

        //Crear y abrir un archivo para escribir. Funciones para serealizar por medio del trait Serealizable de scala
        val writer : ObjectOutputStream = new ObjectOutputStream(new FileOutputStream(path))
        writer.writeObject(pais)
        writer.close() //Cerrar archivo

        //Deserialización
        //Leer un objeto Serializado y convertirlo a objeto scala
        val reader : ObjectInputStream = new ObjectInputStream(new FileInputStream(path))
        val mapa : Mapa = reader.readObject.asInstanceOf[Mapa]
        println("El nombre del pais deserializado es : " + mapa.nombrePais)
        reader.close //Cierra el archivo para lectura
    }
}