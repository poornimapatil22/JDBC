import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Train {


    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String userName="root";
        String password="Poornima!22";
        Connection connection = null;
        connection=DriverManager.getConnection(url, userName, password);
        if (connection != null) {
            System.out.println("connected to mydatabase");

        }
        else {
            System.out.println("its a null");
        }
    }
}