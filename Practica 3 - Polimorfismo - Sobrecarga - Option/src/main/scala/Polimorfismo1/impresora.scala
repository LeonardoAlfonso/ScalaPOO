package Polimorfismo1

class Impresora
{
    //Métodos
    def display(archivo : Archivo) : Unit = 
    {
        println("Se imprime" + archivo.contenido)
    }
}