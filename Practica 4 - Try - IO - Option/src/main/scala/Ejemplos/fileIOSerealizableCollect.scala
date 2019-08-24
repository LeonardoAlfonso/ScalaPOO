package Ejemplos

import scala.io.Source
import java.io._

object fileIOSerealizableCollect {
   def main(args: Array[String]) {
        //Crear Archivo
        var path : String = "ExampleFile2.txt" //Empieza en la raiz del proyecto. 
                                              //Se recomieda ubicarlo dentro de la aplicación en un paquete para archivos
        var paises : Map[String, Mapa] = 
                 Map("Colombia" -> new Mapa("Colombia"), "Peru" -> new Mapa("Peru"))

        //Crear y abrir un archivo para escribir. Funciones para serealizar por medio del trait Serealizable de scala
        val writer : ObjectOutputStream = new ObjectOutputStream(new FileOutputStream(path))
        writer.writeObject(paises)
        writer.close() //Cerrar archivo

        //Deserialización
        //Leer un objeto Serializado y convertirlo a objeto scala
        val reader : ObjectInputStream = new ObjectInputStream(new FileInputStream(path))
        val mapas : Map[String, Mapa] = reader.readObject.asInstanceOf[Map[String, Mapa]]
        println("El nombre del pais deserializado es : " + mapas)
        reader.close //Cierra el archivo para lectura
    }
}