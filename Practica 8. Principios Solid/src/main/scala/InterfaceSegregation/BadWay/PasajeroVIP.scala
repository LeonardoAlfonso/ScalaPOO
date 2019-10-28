package InterfaceSegregation.BadWay

class PasajeroVIP extends IAccionesSala
{
    def ingresoSala(tiquete : String) : Boolean =
    {
        return true
    }

    def ingresarVIP(tiquete : String, tarjeta : String) : Boolean =
    {
        return true
    }
    
    def comprarComida(dinero : Double, productos : List[String]) : String =
    {
        return "comida"
    }

    def verPelicula(pelicula : String) : Unit =
    {
        var x : String = pelicula
    }
}

