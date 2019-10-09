package Builder

class Empleado
{
    //Atributos
    private var _nombre : String = _
    private var _edad : Int = _
    private var _sueldo : Double = _
    private var _planSalud : PlanSalud = _
    private var _direccion : Direccion = _
    private var _email : Email = _
    
    //Métodos
    def nombre = _nombre
    def edad = _edad
    def sueldo = _sueldo
    def planSalud = _planSalud
    def direccion = _direccion
    def email = _email

    def nombre_= (n : String) = _nombre = n
    def edad_= (e : Int) = _edad = e
    def sueldo_= (s : Double) = _sueldo = s
    def planSalud_= (p : PlanSalud) = _planSalud = p
    def direccion_= (d : Direccion) = _direccion = d
    def email_= (e : Email) = _email = e
}
