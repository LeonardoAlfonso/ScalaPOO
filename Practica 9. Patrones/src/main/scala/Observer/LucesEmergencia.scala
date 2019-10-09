package Observer

class LucesEmergencia extends IObserverAlarma
{
    def update(event : String) : Unit = 
    {
        println("El evento es :" + event + "y llegó a las Luces de Emergencia")
    }
}