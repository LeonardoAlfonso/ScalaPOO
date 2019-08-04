package cine

class Taquilla
{
    //Atributos
    private var _catalogo =new Array[Pelicula](1)

    //Inicializar Objetos
      _catalogo(0) = new Pelicula("Duro de matar", 120, "Acción")

    def mostrarCatalogo() : Unit =
    {
        this._catalogo.foreach
        {
           c=>
           {
               println(c.nombre)
           } 
        }
    }

    def mostrarFuncion(nombrePelicula : String) : Boolean =
    {
        var peliculaSeleccionada : Pelicula = this.validarPelicula(nombrePelicula)
        var peliculaExiste : Boolean = false
        if(peliculaSeleccionada.nombre != null)
        {
            peliculaExiste = true
            peliculaSeleccionada.funciones.foreach
            {
                f=>
                  {
                      println(f.horario)
                  }
            }
        }
        else
        {
            println("Pelicula no existente")
        }

        return peliculaExiste
    }

    private def validarPelicula(nombrePelicula : String) : Pelicula =
    {
        var peliculaExistente : Pelicula = new Pelicula
        this._catalogo.foreach
        {
            p=>
            {
                if(p.nombre == nombrePelicula)
                {
                    peliculaExistente = p
                }
            }
        }

        return peliculaExistente
    }
}