package controllers

import javax.inject._
import models._
import userForm._

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import play.api.libs.ws._

import scala.concurrent.Future
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext

@Singleton
class UserController @Inject()(ws: WSClient, components: MessagesControllerComponents) (implicit ec: ExecutionContext)
                     extends MessagesAbstractController(components) {

    def save() = Action { implicit request: MessagesRequest[AnyContent] =>
        userForm.user.bindFromRequest.fold(
            formWithErrors =>
            {
                BadRequest(views.html.user(formWithErrors))
            },
            u =>
            {
                val user : User = User().mapping(u)
                user.save()
                Ok(user.nombre)
            }
        )
    }

    def create() = Action { implicit request: MessagesRequest[AnyContent] =>
        Ok(views.html.user(userForm.user))
    }

    def consulta = Action.async {
        val url = "http://localhost:9000/"
        ws.url(url).get().map{ response =>
            Ok(response.body)
        }
    }

    def consultarUsuarios = Action { implicit request: MessagesRequest[AnyContent] =>
        val users = User().all().map(e => e.nombre)
        Ok(users.toString)
    }
}
