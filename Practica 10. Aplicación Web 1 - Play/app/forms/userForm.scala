package controllers

import play.api.data._
import play.api.data.Forms._
import play.api.data.validation.Constraints._
import play.api.data.format.Formats._

object userForm
{    
    case class UserTemplate(nombre: String, edad: Int, rol: String)

    val user: Form[UserTemplate] = Form(
    // Defines a mapping that will handle Contact values
        mapping(
          "nombre" -> nonEmptyText,
          "edad" -> number.verifying(min(1), max(99)),
          "rol" -> nonEmptyText
        )(UserTemplate.apply)(UserTemplate.unapply)
    )
}