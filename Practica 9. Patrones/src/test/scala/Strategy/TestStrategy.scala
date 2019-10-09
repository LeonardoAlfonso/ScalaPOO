package Strategy

import org.scalatest.GivenWhenThen
import org.scalatest.FeatureSpec
import org.scalatest.mockito.MockitoSugar
import org.mockito.Mockito._

class TestStrategy extends FeatureSpec with GivenWhenThen with MockitoSugar
{
    feature("Realizar cambios de monedas exitosos")
    {
        scenario("Peso a Dolar")
        {
            Given("Dado 10000 pesos")
            var pesos : Double = 10000

            When("Se escoge el tipo de cambio de Peso a Dolar")
            var casaCambio : CasaCambioContext = new CasaCambioContext
            casaCambio.strategy_(new PesoDolar)
            
            Then("La transformación de la moneda debe ser igual a 2.631")
            var costo : Double = casaCambio.consultarCambio(pesos)
            assert(costo == 2.631)
        }

        scenario("Dolar a Peso")
        {
            Given("Dado 5000 dolares")
            var dolares : Double = 5000

            When("Se escoge el tipo de cambio de Peso a Dolar")
            var casaCambio : CasaCambioContext = new CasaCambioContext
            casaCambio.strategy_(new DolarPeso)
            
            Then("La transformación de la moneda debe ser igual a 19000000")
            var costo : Double = casaCambio.consultarCambio(dolares)
            assert(costo == 19000000)
        }

        scenario("Yen a Euro")
        {
            Given("Dado 9000 Yenes")
            var yen : Double = 9000

            When("Se escoge el tipo de cambio de Peso a Dolar")
            var casaCambio : CasaCambioContext = new CasaCambioContext
            casaCambio.strategy_(new YenEuro)
            
            Then("La transformación de la moneda debe ser igual a 19000000")
            var costo : Double = casaCambio.consultarCambio(yen)
            assert(costo == 1058823)
        }
    }
}