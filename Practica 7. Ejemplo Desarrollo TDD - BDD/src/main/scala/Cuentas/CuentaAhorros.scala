package Cuentas

class CuentaAhorros extends ICuenta
{
    //Atributos
    private var _expecto4xMil : Boolean = false

    //Métodos
    def expecto4xMil = _expecto4xMil
    def expecto4xMil_= (expecto4xMil : Boolean) = _expecto4xMil = expecto4xMil
}