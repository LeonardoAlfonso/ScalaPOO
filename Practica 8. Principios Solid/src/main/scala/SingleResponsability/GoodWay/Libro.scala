package SingleResponsability.GoodWay

import scala.util.Try

class Libro
{
    //Atributos
    private var _titulo : String = _
    private var _autor : String = _
    private var _id: Int = _

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
}