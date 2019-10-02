package SingleResponsability.Servicios

import scala.io.Source
import java.io._
import SingleResponsability.GoodWay._
import scala.util.Random
import scala.util.Try

class ServicioLibros
{
    // //Métodos
    def guardarLibro(libro: Libro) : Try[Int] =
    {
        Try({
            libro.id = Random.nextInt(9999999)
            Option(libro.titulo) match
            {
                case Some(s) =>
                {
                    var path : String = "src/main/scala/SingleResponsability/Datos/" + s + ".txt"
                    val writer : ObjectOutputStream = new ObjectOutputStream(new FileOutputStream(path))
                    writer.writeObject(this)
                    writer.close()
                    libro.id
                }
                case None => throw new Exception("El libro no tiene los campos suficientes")
            }
        })
    }
}