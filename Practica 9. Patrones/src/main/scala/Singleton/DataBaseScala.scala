package singleton

object DataBaseScala
{   
    val driver = "mysql"
    val connection = "192.168.2.1"
    val port = "8965"
    val userName = "desarrollo"
    val password = "password123**."

    def showConfiguration() : Unit =
    {
        println(driver)
        println(connection)
        println(port)
        println(userName)
        println(password)
    }
}