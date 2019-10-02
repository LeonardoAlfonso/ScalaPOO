import org.scalatest.GivenWhenThen
import org.scalatest.FeatureSpec
import org.scalatest.mockito.MockitoSugar
import org.mockito.Mockito._

import Banco._
import Cuentas._
import ServiciosExternos._

class Integrales extends FeatureSpec with GivenWhenThen with MockitoSugar
{
    var codigoAprobacion : String = "KJUIO89652"
    var cheque : Cheque = new Cheque
    var banco : Banco = _

    feature("Entregar cheque")
    {
        scenario("Con una cuenta corriente sin saldo")
        {
            Given("Dada una cuenta corriente con saldo 30000")
            var cuentaCorriente : CuentaCorriente = new CuentaCorriente
            cuentaCorriente.saldo = 30000

            When("Se solicita un cheque con 50000")
            var valorCheque : Double = 50000
            var servicioCentralRiesgo = mock[ICentralRiesgo]
            when(servicioCentralRiesgo.consultarPuntaje(cuentaCorriente)).thenReturn(Some(550))
            banco = new Banco(servicioCentralRiesgo)
            cheque.valor = valorCheque
            
            Then("No se aprueba el cheque")
            val chequeSolicitado = cuentaCorriente.crearCheque(banco, valorCheque)
            assert(chequeSolicitado.isEmpty)
        }
    }
}
