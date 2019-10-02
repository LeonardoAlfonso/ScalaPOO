package Cuentas

trait ICuenta
{
    //Atributos
    protected var _saldo : Double = 0

    //Métodos
    def saldo = _saldo
    def saldo_= (saldo : Double) = _saldo = saldo
}