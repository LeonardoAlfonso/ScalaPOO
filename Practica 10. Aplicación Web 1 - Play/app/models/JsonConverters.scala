package models;

import play.api.libs.json._
import play.api.libs.functional.syntax._
import play.api.libs.json.Reads._
import models._

case class BookForm(title: String, autor: String)

trait JsonConverters
{
    implicit val bookslibs: Reads[BookForm] = 
    (
        (JsPath \ "title").read[String](minLength[String](2)) and
        (JsPath \ "autor").read[String]
    )(BookForm.apply _)
}

