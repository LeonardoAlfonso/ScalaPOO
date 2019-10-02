package InterfaceSegregation.GoodWay

class PasajeroEstandar extends IAccionesSala
{
    def ingresoSala(tiquete : String) : Boolean =
    {
        return true
    }
    
    def comprarComida(dinero : Double, productos : List[String]) : String =
    {
        return "comida"
    }
}

