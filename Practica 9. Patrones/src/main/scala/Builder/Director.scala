package Builder

class Director(nuevoBuilder: EmpleadoBuilder)
{
    //Atributos
    private var _builder : EmpleadoBuilder = nuevoBuilder //Inyección de dependencias

    //Métodos
    def builder_= (cambioBuilder: EmpleadoBuilder) = _builder = cambioBuilder

    def makeObject(nombre: String, edad: Int, userName: String, password: String, 
                   direccion: String, barrio: String, ciudad: String, complementos: String = "") : Empleado =
    {
        _builder.construirDatosBasicos(nombre, edad)
        _builder.construirPlanSalud()
        _builder.construirEmail(userName, password)
        _builder.crearDireccion(direccion, barrio, ciudad, complementos)
        return _builder.empleado
    }
}