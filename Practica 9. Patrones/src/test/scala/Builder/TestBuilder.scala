package Builder

import org.scalatest.GivenWhenThen
import org.scalatest.FeatureSpec
import org.scalatest.mockito.MockitoSugar
import org.mockito.Mockito._

class TestBuilder extends FeatureSpec with GivenWhenThen with MockitoSugar
{
    var empleado : Empleado = _

    feature("Crear empleados")
    {
        scenario("Crear un empleado de tipo Auxiliar Contable")
        {
            Given("Dado un creador de empleados con Auxiliar contable")
            var creadorEmpleados : Director = new Director(new AuxiliarContable)

            When("Se asigna el tipo de empleado y los datos del empleado")
            empleado = creadorEmpleados.makeObject("Jeremias", 20, "JereStar", "password123", "Avenidad Siempre Viva",
                                                   "Barrio2", "Cali", "Bloque 9 Apto 203")
            
            Then("El empleado creado debe tener un sueldo de 1500000")
            val sueldo : Double = empleado.sueldo
            assert(sueldo == 1500000)

            And("Y el empleado creado debe tener un plan de salud básico")
            val planSalud : String = empleado.planSalud.tipoPlan
            assert(planSalud == "Básico")
        }

        scenario("Crear un empleado de tipo Desarrollador")
        {
            Given("Dado un creador de empleados con Desarrollador")
            var creadorEmpleados : Director = new Director(new Desarrollador)

            When("Se asigna el tipo de empleado y los datos del empleado")
            empleado = creadorEmpleados.makeObject("Santiago", 25, "ApocaSanti", "password123", "Calle 0",
                                                   "Barrio5", "Cali", "Bloque 11 Apto 401")
            
            Then("El empleado creado debe tener un sueldo de 200000")
            val sueldo : Double = empleado.sueldo
            assert(sueldo == 2000000)

            And("Y el empleado creado debe tener un plan de salud Intermedio")
            val planSalud : String = empleado.planSalud.tipoPlan
            assert(planSalud == "Intermedio")
        }
    }
}