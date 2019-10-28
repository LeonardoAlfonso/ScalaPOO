package models
 
import io.ebean._
import javax.persistence.Entity
import javax.persistence.ManyToOne
import javax.persistence.Column
import javax.persistence.Id
import javax.persistence.CascadeType
import com.typesafe.config.Config
import scala.collection.JavaConverters._
 
@Entity
case class Book() extends Model 
{
    //Atributos
    @Id
    @Column(name="idBook")
      private var _id : Long = 0
 
    @Column(name="nombre")
      private var _title : String = ""
 
    @Column(name="autor")
      private var _author : String = ""
 
    //Getters y Settes
      def id = _id
      def title = _title
      def author = _author
 
      def id_=(id : Long) = _id = id
      def title_=(title: String) = _title = title
      def author_=(author: String) = _author = author
 
    var find : Finder[Long, Book] = new Finder[Long, Book](classOf[Book])
 
    def all(): List[Book] = find.all.asScala.toList

    def mapping(bookForm : BookForm) : Book =
    {
        _title = bookForm.title
        _author = bookForm.autor
        return this
    }
}