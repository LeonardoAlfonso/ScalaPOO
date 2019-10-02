import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter
import Banco._

class UnitariasCheque extends FunSuite with BeforeAndAfter 
{
    var cheque : Cheque = new Cheque

    test("Verificar que el cheque inicie con saldo 0") {
        assert(cheque.valor == 0)
    }

    test("Cambiar el valor del cheque a 50000") {
        cheque.valor = 50000
        assert(cheque.valor == 50000)
    }
}