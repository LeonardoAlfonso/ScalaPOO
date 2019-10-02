package SingleResponsability.BadWay

import java.io._
import scala.util.Random
import scala.util.Try
import scala.io.Source
import SingleResponsability.Servicios._

class Libro extends Serializable
{
    //Atributos
    private var _id : Int = _
    private var _titulo : String = _
    private var _autor : String = _

    //Constructores
    def this(tituloLibro : String, autorLibro : String)
    {
        this()
        _titulo = tituloLibro
        _autor = autorLibro
    }

    //Métodos

    //Getters
    def titulo = _titulo
    def autor = _autor 
    def id = _id

    //Setters
    def titulo_= (tituloLibro : String) : Try[Unit] = Try(_titulo = tituloLibro)
    def autor_= (autorLibro : String) : Try[Unit] = Try(_autor = autorLibro)
    def id_= (idLibro : Int) : Try[Unit] = Try(_id = idLibro)

    def guardarLibro(libro: Libro) : Try[Int] =
    {
        Try({
            libro.id = Random.nextInt(9999999)
            Option(libro.titulo) match
            {
                case Some(s) =>
                {
                    var path : String = "src/main/scala/Datos/SingleResponsability/" + s + ".txt"
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