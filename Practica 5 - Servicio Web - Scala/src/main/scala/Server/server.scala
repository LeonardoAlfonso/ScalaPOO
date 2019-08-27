package Server

import akka.http.scaladsl.Http
import akka.http.scaladsl.server._
import akka.actor.ActorSystem
import akka.stream.ActorMaterializer

object Server extends App with Directives {
    implicit val system = ActorSystem("actor-system")
    implicit val materializer: ActorMaterializer = ActorMaterializer()

    val routes: Route =
        path("test") {
            get {
            complete("getTest")
            }
        } ~
        path("test") {
            post {
            complete("postTest")
            }
        }
    Http().bindAndHandle(routes, "0.0.0.0", 8002)
}