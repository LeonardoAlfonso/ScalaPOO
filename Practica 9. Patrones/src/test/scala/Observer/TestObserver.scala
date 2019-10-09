package Observer

import org.scalatest.GivenWhenThen
import org.scalatest.FeatureSpec
import org.scalatest.mockito.MockitoSugar
import org.mockito.Mockito._

class TestObserver extends FeatureSpec with GivenWhenThen with MockitoSugar
{
    feature("Probar Evento de Alarma")
    {
        scenario("Se dispara una alarma")
        {
            Given("Dado un gestor de alarmas")
            var publisher : GestionAlarma = new GestionAlarma

            When("Se le agregan diferentes alarmas")
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
            
            Then("Se envía un evento")
            publisher.notifyEvent("Ladrones, Ladrones!")
        }
    }
}