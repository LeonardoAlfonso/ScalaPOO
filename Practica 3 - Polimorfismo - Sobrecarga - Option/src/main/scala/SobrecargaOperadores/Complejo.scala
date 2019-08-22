package SobrecargaOperadores

class Complejo(var real : Double, var imag : Double) 
{
  //Atributos
    private var _real : Double = real
    private var _imag : Double = imag
  
  //Métodos
  def +(that: Complejo) =
            new Complejo(this._real + that._real, this._imag + that._imag)
   
  def -(that: Complejo) =
            new Complejo(this._real - that._real, this._imag - that._imag)
 
  override def toString = real + " + " + imag + "i"
}