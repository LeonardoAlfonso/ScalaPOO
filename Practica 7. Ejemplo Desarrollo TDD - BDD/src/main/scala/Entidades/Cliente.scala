package Entidades

import Cuentas._
import Banco._

class Cliente(nombreCliente : String)
{
    //Atributos
    private var _nombre : String = nombreCliente
    private var _identificacion : Identificacion = _
    private var _email : Email = _
    private var _productos : Set[ICuenta] = _

    //Métodos
}