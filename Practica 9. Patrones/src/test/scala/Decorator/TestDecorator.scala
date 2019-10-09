package Decorator

import org.scalatest.GivenWhenThen
import org.scalatest.FeatureSpec
import org.scalatest.mockito.MockitoSugar
import org.mockito.Mockito._

class TestDecorator extends FeatureSpec with GivenWhenThen with MockitoSugar
{
    feature("Crear carros con Vidrios Polarizados")
    {
        scenario("Con un carro Mazda")
        {
            Given("Dado un carro Mazda")
            var mazda : Mazda = new Mazda

            When("Se le agregan los vidrios polarizados")
            var vidriosPolarizados : VentanaPolarizada = new VentanaPolarizada(mazda)
            
            Then("El costo del carro es 27000 dolares")
            val costo : Double = vidriosPolarizados.getCosto()
            assert(costo == 20700)
        }

        scenario("Con un carro Audi")
        {
            Given("Dado un carro Audi")
            var audi : Audi = new Audi

            When("Se le agregan los vidrios polarizados")
            var vidriosPolarizados : VentanaPolarizada = new VentanaPolarizada(audi)
            
            Then("El costo del carro es 50700 dolares")
            val costo : Double = vidriosPolarizados.getCosto()
            assert(costo == 50700)
        }
    }

    feature("Crear carros con los 4 accesorios")
    {
        scenario("Con un carro Mazda")
        {
            Given("Dado un carro Mazda")
            var mazda : Mazda = new Mazda

            When("Se le agregan todos los accesorios y adicionales")
            var vidriosPolarizados : VentanaPolarizada = new VentanaPolarizada(mazda)
            var vidriosElectricos : VentanaElectrica = new VentanaElectrica(vidriosPolarizados)
            var cajaCambios : CajaCambiosAuto = new CajaCambiosAuto(vidriosElectricos)
            var camaraReversa : CamaraReversa = new CamaraReversa(cajaCambios)
            
            Then("El costo del carro es 30350 dolares")
            val costo : Double = camaraReversa.getCosto()
            assert(costo == 23350)
        }

        scenario("Con un carro Audi")
        {
            Given("Dado un carro Mazda")
            var audi : Audi = new Audi

            When("Se le agregan todos los accesorios y adicionales")
            var vidriosPolarizados : VentanaPolarizada = new VentanaPolarizada(audi)
            var vidriosElectricos : VentanaElectrica = new VentanaElectrica(vidriosPolarizados)
            var cajaCambios : CajaCambiosAuto = new CajaCambiosAuto(vidriosElectricos)
            var camaraReversa : CamaraReversa = new CamaraReversa(cajaCambios)
            
            Then("El costo del carro es 53350 dolares")
            val costo : Double = camaraReversa.getCosto()
            assert(costo == 53350)
        }
    }
}