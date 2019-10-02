package InterfaceSegregation.BadWay

trait IAccionesSala
{
    def ingresoSala(tiquete : String) : Boolean
    def ingresarVIP(tiquete : String, tarjeta : String) : Boolean
    def comprarComida(dinero : Double, productos : List[String]) : String
    def verPelicula(pelicula : String) : Unit
}