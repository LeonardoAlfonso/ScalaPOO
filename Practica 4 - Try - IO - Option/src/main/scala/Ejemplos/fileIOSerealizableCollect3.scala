package Ejemplos

import java.io._

//Para serializar Listas y Sequencias se debe agregar una configuración en el build.sbt
object fileIOSerealizableCollect3 {
   def main(args: Array[String]) {
        //Crear Archivo
        var path : String = "ExampleFile4.txt" //Empieza en la raiz del proyecto. 
                                              //Se recomieda ubicarlo dentro de la aplicación en un paquete para archivos
        var paises : List[Mapa] = List(new Mapa("Colombia"), new Mapa("Peru"))

        //Crear y abrir un archivo para escribir. Funciones para serealizar por medio del trait Serealizable de scala
        val writer : ObjectOutputStream = new ObjectOutputStream(new FileOutputStream(path))   
        writer.writeObject(paises)        
        writer.close() //Cerrar archivo

        //Deserialización
        //Leer un objeto Serializado y convertirlo a objeto scala
        val reader : ObjectInputStream = new ObjectInputStream(new FileInputStream(path))
        val mapas : List[Mapa] = reader.readObject.asInstanceOf[List[Mapa]]
        println("El nombre del pais deserializado es : " + mapas)
        reader.close //Cierra el archivo para lectura
    }
}