package singleton

import org.scalatest.GivenWhenThen
import org.scalatest.FeatureSpec
import org.scalatest.mockito.MockitoSugar
import org.mockito.Mockito._

class TestSingleton extends FeatureSpec with GivenWhenThen with MockitoSugar
{
    feature("Probar la base de datos Java")
    {
        scenario("Java")
        {
            Given("Dada una Base de datos de Java")
            val Database1 = DataBaseJava.getSingletonInstance("mysql", "19.168.1.2", "8969", "desarrollo", "password123**.")
    
            When("Se crea una nueva base de datos java con otros datos")
            val Database2 = DataBaseJava.getSingletonInstance("oracle", "10.45.63.2", "2036", "desarrollo", "password123**.")
            
            Then("El driver de la Base de Datos 1 es mysql")
            assert(Database1.getDriver() == "mysql")

            And("El driver de la Base de Datos 2 es mysql")
            assert(Database2.getDriver() == "mysql")
        }

        scenario("Scala")
        {
            Given("Dada una Base de datos de Scala")
            val Database1 = DataBaseScala
    
            When("")
            
            Then("El driver de la Base de Datos 1 es mysql")
            assert(Database1.driver == "mysql")
        }
    }
}