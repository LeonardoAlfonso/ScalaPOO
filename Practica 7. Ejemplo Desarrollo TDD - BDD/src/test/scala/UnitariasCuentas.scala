import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter
import org.scalatest.mockito.MockitoSugar
import org.mockito.Mockito._
import Banco._
import Cuentas._
import scala.util._

class UnitariasCuentas extends FunSuite with BeforeAndAfter with MockitoSugar
{
    var cuentaAhorros : CuentaAhorros = new CuentaAhorros
    var cuentaCorriente : CuentaCorriente = new CuentaCorriente

    test("Agregar $10000 de saldo a la cuenta de ahorros") {
        cuentaAhorros.saldo = 10000
        assert(cuentaAhorros.saldo == 10000)
    }

    test("Verificar que la cuenta de ahorros inicie sin exención del 4xMil") {
        assert(!cuentaAhorros.expecto4xMil)
    }

    test("Verificar que se pueda habilitar la exención del 4xMil") {
        cuentaAhorros.expecto4xMil = true
        assert(cuentaAhorros.expecto4xMil)
    }

    test("Agregar $5000 de saldo a la cuenta corriente") {
        cuentaAhorros.saldo = 5000
        assert(cuentaAhorros.saldo == 5000)
    }

    test("Verificar que la cuenta corriente empiece sin sobregiro") {
        assert(!cuentaCorriente.tieneSobregiro)
    }

    test("Verificar que la cuenta de ahorros no tiene sobregiro si no tiene aprobado el sobregiro"){
        cuentaCorriente.cupoSobregiro match
        {
            case Some(s) => fail()
            case None => succeed
        }
    }

    test("Verificar que no se pueda asignar cupo si el sobregiro no ha sido aprobado"){
        (cuentaCorriente.cupoSobregiro = 100000) match
        {
            case Success(s) => fail()
            case Failure(f) => succeed
        }
    }

    test("Verificar que la cuenta de ahorros cambie el sobregiro correctamente"){
        cuentaCorriente.tieneSobregiro = true
        assert(cuentaCorriente.tieneSobregiro)
    }

    test("Verificar que se pueda asignar cupo si el sobregiro ha sido aprobado"){
        cuentaCorriente.tieneSobregiro = true
        (cuentaCorriente.cupoSobregiro = 100000) match
        {
            case Success(s) => succeed
            case Failure(f) => fail()
        }
    }

    val banco = mock[IBanco]
    var cuentaAprobada : CuentaCorriente = new CuentaCorriente
    var cuentaDesaprobada : CuentaCorriente = new CuentaCorriente
    var cheque : Cheque = new Cheque
    var codigoAprobacion : String = "KJUIO89652"
    var valorCheque : Double = 200000
    var codigoFalso : String = "OPOLO"
    cheque.valor = valorCheque

    //Mock Métodos
    when(banco.aprobarCheque(cuentaAprobada, valorCheque)).thenReturn(Some(codigoAprobacion))
    when(banco.aprobarCheque(cuentaDesaprobada, valorCheque)).thenReturn(None)
    when(banco.generarCheque(codigoAprobacion)).thenReturn(Some(cheque))
    when(banco.generarCheque(codigoFalso)).thenReturn(None)

    /*Prueba Cheque*/
    // test("Verificar que el banco apruebe el cheque y este se retorne correctamente") (pending)
    test("Verificar que el banco apruebe el cheque y este se retorne correctamente")
    {
        cuentaAprobada.crearCheque(banco, valorCheque) match
        {
            case Some(s) => succeed
            case None => fail()
        }
    }

    test("Verificar que el banco desapruebe el cheque")
    {
        cuentaDesaprobada.crearCheque(banco, valorCheque) match
        {
            case Some(s) => fail()
            case None => succeed
        }
    }
}
