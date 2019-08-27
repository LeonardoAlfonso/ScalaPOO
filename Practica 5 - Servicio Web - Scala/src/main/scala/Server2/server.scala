package Server2

import akka.http.scaladsl.Http
import akka.http.scaladsl.server._
import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import ComidaRapida._

object Server extends App with Directives {
    implicit val system = ActorSystem("actor-system")
    implicit val materializer: ActorMaterializer = ActorMaterializer()

    var bebida : Bebida = new Bebida

    val routes: Route =
        path("test") {
            get {
            complete(bebida.tipo)
            }
        } ~
        path("test") {
            post {
            complete(bebida.tamano.toString)
            }
        }

    Http().bindAndHandle(routes, "0.0.0.0", 8002)
}