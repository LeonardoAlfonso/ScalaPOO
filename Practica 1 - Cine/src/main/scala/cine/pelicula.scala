package cine

class Pelicula(nombreInicial: String, duracionTotal: Int, generoInicial: String)
{
    //Atributos
    private var _nombre: String = nombreInicial
    private var _duracion: Int = duracionTotal
    private var _genero: String = generoInicial
    private var _funciones = new Array[Funcion](2)

    _funciones(0) = new Funcion("8:00", 5)
    _funciones(1) = new Funcion("11:00", 8)

    //Constructores
    def this()
    {
        this(null, 0, "")
    }

    //Métodos
    def nombre = _nombre
    def duracion = _duracion
    def genero = _genero
    def funciones = _funciones
}