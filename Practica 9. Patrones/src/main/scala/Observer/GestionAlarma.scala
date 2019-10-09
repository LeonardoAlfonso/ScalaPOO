package Observer

class GestionAlarma
{
    private var alarmas : List[IObserverAlarma] = List()
    
    def suscribe(s: IObserverAlarma) : Unit =
    {
        alarmas = alarmas ::: List(s)
    }

    def unsuscribe(s: IObserverAlarma) : Unit =
    {
        alarmas = alarmas.filter(a => a != s)
    }

    def notifyEvent(message : String) : Unit = 
    {
        alarmas.map(a => a.update(message))
    }
}

object ObserverPatterns extends App
{
    var publisher : GestionAlarma = new GestionAlarma
    var alarma1 : AlarmaSonora = new AlarmaSonora
    var alarma2 : LucesEmergencia = new LucesEmergencia
    var alarma3 : AlarmaSonora = new AlarmaSonora
    var alarma4 : LucesEmergencia = new LucesEmergencia
    var alarma5 : Policia = new Policia
    publisher.suscribe(alarma1)
    publisher.suscribe(alarma2)
    publisher.suscribe(alarma3)
    publisher.suscribe(alarma4)
    publisher.suscribe(alarma5)
    publisher.notifyEvent("Ladrones, Ladrones! ")
}
