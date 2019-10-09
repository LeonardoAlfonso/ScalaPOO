package Observer

class Policia extends IObserverAlarma
{
    def update(event : String) : Unit = 
    {
        println("El evento es :" + event + "y se llama a la policia")
    }
}