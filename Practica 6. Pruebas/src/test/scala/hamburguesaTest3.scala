import org.scalatest.GivenWhenThen
import org.scalatest.FeatureSpec

class hamburguesaTest3 extends FeatureSpec with GivenWhenThen
{ 
    var hamburguesa : Hamburguesa = _

    feature("Creación de Hamburguesa con diferentes ingredientes")
    {
      info("Se creará una hamburguesa con precio base de 3000")

      scenario("Hamburguesa comn 2 ingredientes"){
          
          Given("Una nueva Hamburguesa")
          hamburguesa = new Hamburguesa(3000)
          When("Se agregan 2 ingredientes")
          hamburguesa.agregarIngrediente("pollo")
          hamburguesa.agregarIngrediente("lechuga")
          Then("El precio final es de 7000")
          assert(hamburguesa.calcularPrecio() == 7000)
          And("La cantidad de ingredientes es igual a 2")
          assert(hamburguesa.ingredientes.size == 1)
      }

      scenario("El precio calculado es correcto"){
          Given("Una nueva Hamburguesa de 3000")
          hamburguesa = new Hamburguesa(3000)
          When("Se agregan 2 ingredientes")
          hamburguesa.agregarIngrediente("pollo")
          //hamburguesa.agregarIngrediente("lechuga")
          Then("El precio final es de 5000")
          assertResult(5000){hamburguesa.calcularPrecio()}
          And("La cantidad de ingredientes es igual a 1")
          assertResult(2){hamburguesa.ingredientes.size}
      }
    }
}