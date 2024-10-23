import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Rain {

    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://localhost:3306/rain";
        String userName="root";
        String password="Poornima!22";

        Connection connection=null;
        connection= DriverManager.getConnection(url,userName,password);

        if(connection!=null){
            System.out.println(userName);
            System.out.println(password);
            System.out.println("Rain is executed");

        }else{
            System.out.println("its a null");
        }
    }


}
