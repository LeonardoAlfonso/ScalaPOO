package Builder

abstract class EmpleadoBuilder
{
    //Atributos
    protected var _empleado : Empleado = new Empleado

    //Metodos
    def construirDatosBasicos(nombre: String, edad: Int) : Unit
    def construirPlanSalud() : Unit
    def construirEmail(usuario: String, password: String) : Unit
    def crearDireccion(direccion: String, barrio: String, ciudad: String, complementos: String) : Unit
    def empleado = _empleado
}