package singleton;

public class DataBaseJava 
{
    private String driver;
    private String connection;
    private String port;
    private String userName;
    private String password;
    private static DataBaseJava database;

    private DataBaseJava(String driver, String connection, String port, String userName, String password) 
    {
        this.driver = driver;
        this.connection = connection;
        this.port = port;
        this.userName = userName;
        this.password = password;
    }

    public static DataBaseJava getSingletonInstance(String driver, String connection, String port, 
                                                  String userName, String password) {
        if (database == null){
            database = new DataBaseJava(driver, connection, port, userName, password);
        }
        
        return database;
    }

    public void showConfiguration()
    {
        System.out.println(driver);
        System.out.println(connection);
        System.out.println(port);
    }

    public String getDriver()
    {
        return this.driver;
    }

    public String getConnection()
    {
        return this.connection;
    }

    public String getPort()
    {
        return this.port;
    }

    public String getUserName()
    {
        return this.userName;
    }

    public String getPassword()
    {
        return this.password;
    }
}