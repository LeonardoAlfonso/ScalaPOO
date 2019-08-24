package Ejemplos

import scala.io.Source
import java.io._

object fileIO {
   def main(args: Array[String]) {
        //Crear Archivo
        var path : String = "ExampleFile.txt" //Empieza en la raiz del proyecto. 
                                              //Se recomieda ubicarlo dentro de la aplicación en un paquete para archivo

        var pais : Mapa = new Mapa("Argentina") //Revisar la clase Mapa. Sobreescribe el método toString
        var pais2 : Pais = new Pais("Peru") //Revisar la clase Pais. No sobreescribe el método toString

        //Crear y abrir un archivo para escribir
        val writer = new PrintWriter(new File(path))
        writer.write("paises ")
        //Si se desea guardar un objeto se debe usar el método .toString sobre el objetos. 
        //Esto es serialización sobre string
        writer.write(pais.toString) //Si se desea guardar un objeto, se debe usar la función toString
        writer.close()
        
        //Para leer un archivo linea por linea como Strings
        for (line <- Source.fromFile(path).getLines) {
            println(line)
        }
    }
}