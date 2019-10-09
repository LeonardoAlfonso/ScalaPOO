package Builder

class PlanSalud
{
    //Atributos
    private var _tipoPlan : String = _
    private var _cantidadCitasGratis : Int = _
    
    //Métodos
    def tipoPlan = _tipoPlan
    def cantidadCitasGratis = _cantidadCitasGratis

    def tipoPlan_= (t : String) = _tipoPlan = t
    def cantidadCitasGratis_= (c : Int) = _cantidadCitasGratis = c
}