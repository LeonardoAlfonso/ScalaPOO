package InterfaceSegregation.GoodWay

trait IAccionesVIP
{
    def ingresarVIP(tiquete : String, tarjeta : String) : Boolean
    def verPelicula(pelicula : String) : Unit
}