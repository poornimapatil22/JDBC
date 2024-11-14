package com.xworkz.database;

import com.xworkz.enumeration.CompnyEnum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseValues {
    public static void main(String[] args) {
        Connection connection = null;

        String insert3 = "INSERT INTO company_data VALUES (3,'sakshi','sakshi@gmail.com',8084567878,'sakshi123',75000,'2024','whiteField',7.0,'saksen')";
        String insert4 = "INSERT INTO company_data VALUES (4,'saki','saki@gmail.com',8888888878,'saki123',95000,'2024','whiteField',7.0,'ksen')";
        String insert5 = "INSERT INTO company_data VALUES (5,'preeti','preeti@gmail.com',7777777778,'preeti123',50000,'2026','kagwad',10.0,'dental')";
        String insert6 = "INSERT INTO company_data VALUES (6,'manu','manu@gmail.com',8084567919,'manu123',98000,'2024','hsr',9.0,'aiml')";
        String insert9 = "INSERT INTO company_data VALUES (9,'sakshi','sakshi@gmail.com',8084567878,'sakshi123',45000,'2024','whiteField',7.0,'saksen')";
        String insert10 = "INSERT INTO company_data VALUES (10,'sakshi','sakshi@gmail.com',8084567878,'sakshi123',87000,'2024','whiteField',5.0,'saksen')";
        String insert11 = "INSERT INTO company_data VALUES (11,'siya','siya@gmail.com',9999999999,'siya123',85000,'2025','electronic city',6.0,'tata')";
        String insert20 = "INSERT INTO company_data VALUES (20,'kshiti','kshiti@gmail.com',8888888888,'kshiti123',90000,'2027','rt nagar',9.0,'vega')";
        String insert13 = "INSERT INTO company_data VALUES (13,'mini','mini@gmail.com',9990008880,'mini123',45000,'2024','btm',11.0,'charles')";
        String insert14 = "INSERT INTO company_data VALUES (14,'sneha','sneha@gmail.com',8977777798,'sneha123',40500,'2027','jugul',7.0,'bagalkote')";
        String insert15 = "INSERT INTO company_data VALUES (15,'piya','piya@gmail.com',7778887778,'piya123',95000,'2024','athani',9.0,'sugars')";
        String insert16 = "INSERT INTO company_data VALUES (16,'sita','sita999@gmail.com',8989898989,'sita444',85000,'2024','whiteField',7.0,'angents')";
        String insert17 = "INSERT INTO company_data VALUES (17,'sakshi','sakshi@gmail.com',8084567878,'sakshi123',45000,'2024','whiteField',7.0,'saksen')";
        String insert18 = "INSERT INTO company_data VALUES (18,'ritvi','ritvi@gmail.com',6666666666,'ritvi123',55000,'2045','nipani',9.0,'misile')";
        String insert19 = "INSERT INTO company_data VALUES (19,'rushi','rushi@gmail.com',8084567879,'rushi123',45000,'2024','kagwad',10.0,'enzymes')";


        try {
            connection= DriverManager.getConnection(CompnyEnum.URL.getValue(),CompnyEnum.USERNAME.getValue(),CompnyEnum.PASSWORD.getValue());
            Statement statement=connection.createStatement();

            statement.executeUpdate(insert3);
            statement.executeUpdate(insert4);
            statement.executeUpdate(insert5);
            statement.executeUpdate(insert6);
            statement.executeUpdate(insert9);
            statement.executeUpdate(insert10);
            statement.executeUpdate(insert11);
            statement.executeUpdate(insert13);
            statement.executeUpdate(insert14);
            statement.executeUpdate(insert15);
            statement.executeUpdate(insert16);
            statement.executeUpdate(insert17);
            statement.executeUpdate(insert18);
            statement.executeUpdate(insert19);
            statement.executeUpdate(insert20);

        } catch (SQLException e) {
           e.printStackTrace();
        }
    }
}
//127812