package Builder

class Email
{
    //Atributos
    private var _usuario : String = _
    private var _dominio : String = _
    private var _password : String = _
    
    //Métodos
    def usuario = _usuario
    def dominio = _dominio
    def password = _password

    def usuario_= (u : String) = _usuario = u
    def dominio_= (d : String) = _dominio = d
    def password_= (p : String) = _password = p
}