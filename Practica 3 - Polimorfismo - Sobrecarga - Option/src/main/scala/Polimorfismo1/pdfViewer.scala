package Polimorfismo1

class PdfViewer
{
    //Métodos
    def display(archivo : Archivo) : Unit =
    {
        println("Se muestra en PDF " + archivo.contenido)
    }
}