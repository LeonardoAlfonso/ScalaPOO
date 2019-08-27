package Server3

import akka.http.scaladsl.Http
import akka.http.scaladsl.server._
import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import ComidaRapida._

object Server extends App with Directives with JsonSupport{
    implicit val system = ActorSystem("actor-system")
    implicit val materializer: ActorMaterializer = ActorMaterializer()

    var bebida : Bebida = new Bebida

    val routes: Route =
        path("test" / Segment / IntNumber) { (data, id) =>
            get {
            complete(data + id.toString)
            }
        } ~
        path("test") {
            post {
                entity(as[Person]) { persona =>
                    complete("La persona se llama " + persona.name + " y su número favorito es " + persona.favoriteNumber.toString)
                }
            }
        }

    Http().bindAndHandle(routes, "0.0.0.0", 8002)
}

