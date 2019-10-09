package Builder

class Desarrollador extends EmpleadoBuilder
{
    //Metodos
    def construirDatosBasicos(nombre: String, edad: Int) : Unit = 
    {
        _empleado.nombre = nombre
        _empleado.edad = edad
        _empleado.sueldo = 2000000
    }

    def construirPlanSalud() : Unit = 
    {
        val planSalud : PlanSalud = new PlanSalud
        planSalud.tipoPlan = "Intermedio"
        planSalud.cantidadCitasGratis = 10
        _empleado.planSalud = planSalud
    }

    def construirEmail(usuario: String, password: String) : Unit = 
    {
        val email : Email = new Email
        email.usuario = usuario
        email.dominio = "@desarrolloEmpresa.com"
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