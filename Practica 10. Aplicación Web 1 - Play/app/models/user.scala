package models
 
import io.ebean._
import javax.persistence.Entity
import javax.persistence.ManyToOne
import javax.persistence.Column
import javax.persistence.Id
import javax.persistence.CascadeType
import com.typesafe.config.Config
import scala.collection.JavaConverters._
import controllers.userForm._
 
@Entity
case class User() extends Model 
{
    //Atributos
    @Id
    @Column(name="idUser")
      private var _id : Long = 0
 
    @Column(name="nombre")
      private var _nombre : String = ""
 
    @Column(name="autor")
      private var _edad : Int = 0

    @Column(name="rol")
      private var _rol : String = ""
 
    //Getters y Settes
      def id = _id
      def nombre = _nombre
      def edad = _edad
      def rol = _rol
 
      def id_=(id : Long) = _id = id
      def nombre_=(nombre: String) = _nombre = nombre
      def edad_=(edad: Int) = _edad = edad
      def rol_=(rol: String) = _rol = rol
 
      var find : Finder[Long, User] = new Finder[Long, User](classOf[User])
  
      def all(): List[User] = find.all.asScala.toList

      def mapping(userTemplate : UserTemplate) : User =
      {
          _nombre = userTemplate.nombre
          _edad = userTemplate.edad
          _rol = userTemplate.rol
          return this
      }
}