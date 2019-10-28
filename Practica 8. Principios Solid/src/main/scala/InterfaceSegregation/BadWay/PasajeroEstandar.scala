package InterfaceSegregation.BadWay

class PasajeroEstandar extends IAccionesSala
{
    def ingresoSala(tiquete : String) : Boolean =
    {
        return true
    }

    def ingresarVIP(tiquete : String, tarjeta : String) : Boolean =
    {
        throw new Exception("No Implementado")
    }
    
    def comprarComida(dinero : Double, productos : List[String]) : String =
    {
        return "comida"
    }

    def verPelicula(pelicula : String) : Unit =
    {
        throw new Exception("No implementado")
    }
}

