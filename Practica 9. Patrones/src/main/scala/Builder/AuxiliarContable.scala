package Builder

class AuxiliarContable extends EmpleadoBuilder
{
    //Metodos
    def construirDatosBasicos(nombre: String, edad: Int) : Unit = 
    {
        _empleado.nombre = nombre
        _empleado.edad = edad
        _empleado.sueldo = 1500000
    }

    def construirPlanSalud() : Unit = 
    {
        val planSalud : PlanSalud = new PlanSalud
        planSalud.tipoPlan = "Básico"
        planSalud.cantidadCitasGratis = 5
        _empleado.planSalud = planSalud
    }

    def construirEmail(usuario: String, password: String) : Unit = 
    {
        val email : Email = new Email
        email.usuario = usuario
        email.dominio = "@contableEmpresa.com"
        email.password = password
        _empleado.email = email
    }

    def crearDireccion(dir: String, barrio: String, ciudad: String, complementos: String) : Unit =
    {
        val direccion : Direccion = new Direccion
        direccion.direccion = dir
        direccion.barrio = barrio
        direccion.ciudad = ciudad
        direccion.complementos = complementos
        _empleado.direccion = direccion
    }
}