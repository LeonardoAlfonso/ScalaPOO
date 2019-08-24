package Polimorfismo1

abstract class Archivo
{
    //Atributos
    protected var _peso : Double //Abstracto
    protected var _extension : String //Abstracto
    protected var _contenido : String = _ 

    //Métodos
    //Getters
    def peso = _peso
    def extension = _extension
    def contenido = _contenido

    //Setters
    def peso_(nuevoPeso : Double) = _peso = nuevoPeso
    def extension_(nuevaExtension : String) = _extension = nuevaExtension
    def contenido_(nuevoContenido : String) = _contenido = nuevoContenido
}