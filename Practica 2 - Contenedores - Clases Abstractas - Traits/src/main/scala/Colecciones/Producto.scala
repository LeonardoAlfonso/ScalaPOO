package Colecciones

class Producto(var nombreProducto : String, var precioProducto : Double)
{
   //Atributos
    private var _nombre : String = nombreProducto
    private var _precio : Double = precioProducto
  
  //Métodos
        //Getters
        def nombre = _nombre
        def precio = _precio
        
        //Setters
        def cantidad_(precioProducto : Double) = _precio = precioProducto
        def nombre_(nombreProducto : String) = _nombre = nombreProducto
}