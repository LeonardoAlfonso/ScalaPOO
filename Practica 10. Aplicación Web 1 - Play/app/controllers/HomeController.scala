package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import models._
import play.api.libs.json._
import play.api.libs.functional.syntax._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) with JsonConverters{

    def save() = Action { implicit request: Request[AnyContent] =>
        val body: AnyContent          = request.body
        val jsonBody: Option[JsValue] = body.asJson
        val json : JsObject = jsonBody.getOrElse(JsNull).as[JsObject]
// 
        val bookResult: JsResult[BookForm] = json.validate[BookForm]

        bookResult match
        {
            case s: JsSuccess[BookForm] => 
            {
                val book : Book = Book().mapping(s.get)
                book.save()
                Ok(book.title)
            }
            case e: JsError => Ok("Error en el Json de entrada")
        }
    }

    def index() = Action { implicit request: Request[AnyContent] =>
        val books : List[Book] = Book().all()
        val titles : List[String] = books.map(e => e.title)
        //  val titles : List[String] = books.filter(i => i.title.contains("a")).map(e => e.title)

        Ok(titles.toString)
    }
}


