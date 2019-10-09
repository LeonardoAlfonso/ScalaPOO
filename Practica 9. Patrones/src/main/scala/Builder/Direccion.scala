package Builder

class Direccion
{
    //Atributos
    private var _direccion : String = _
    private var _barrio : String = _
    private var _ciudad : String = _
    private var _complementos : String = _
    
    //Métodos
    def direccion = _direccion
    def barrio = _barrio
    def ciudad = _ciudad
    def complementos = _complementos

    def direccion_= (d : String) = _direccion = d
    def barrio_= (b : String) = _barrio = b
    def ciudad_= (c : String) = _ciudad = c
    def complementos_= (cm : String) = _complementos = cm
}