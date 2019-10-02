package InterfaceSegregation.GoodWay

trait IAccionesSala
{
    def ingresoSala(tiquete : String) : Boolean    
    def comprarComida(dinero : Double, productos : List[String]) : String
}