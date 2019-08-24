package Ejemplos

import scala.io.Source
import java.io._

object fileIOSerealizableCollect2 {
   def main(args: Array[String]) {
        //Crear Archivo
        var path : String = "ExampleFile3.txt" //Empieza en la raiz del proyecto. 
                                              //Se recomieda ubicarlo dentro de la aplicación en un paquete para archivos
        var paises : Set[Mapa] = Set(new Mapa("Colombia"), new Mapa("Peru"))

        //Crear y abrir un archivo para escribir. Funciones para serealizar por medio del trait Serealizable de scala
        val writer : ObjectOutputStream = new ObjectOutputStream(new FileOutputStream(path))   
        writer.writeObject(paises)        
        writer.close() //Cerrar archivo

        //Deserialización
        //Leer un objeto Serializado y convertirlo a objeto scala
        val reader : ObjectInputStream = new ObjectInputStream(new FileInputStream(path))
        val mapas : Set[Mapa] = reader.readObject.asInstanceOf[Set[Mapa]]
        println("La lista de mapas es : " + mapas)
        reader.close //Cierra el archivo para lectura
    }
}