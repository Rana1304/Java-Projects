import java.sql.*;

public class Conn {

    public Statement statement;
    public Conn(){
        
        Connection connection;
        
        try {
            
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","jr@1301");
            statement = connection.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
