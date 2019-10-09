package Observer

class AlarmaSonora extends IObserverAlarma
{
    def update(event : String) : Unit = 
    {
        println("El evento es :" + event + "y llegó a la Alarma Sonora")
    }
}