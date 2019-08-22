package Pruebas

import Polimorfismo1._

object prueba1 extends App{
    var documento1 : Archivo = new Documento(1024)
    var documento2 : Archivo = new Imagen(3045)
    var impresora : Impresora = new Impresora
    var pdf : PdfViewer = new PdfViewer
    var camara : Camara = new Camara

    documento1.contenido_("Este es el contenido del archivo")
    documento2.contenido_("Este es el contenido del archivo")

    impresora.display(documento1)
    impresora.display(documento2)

    pdf.display(documento1)
    pdf.display(documento2)

    camara.display(documento1)
    camara.display(documento2)
}