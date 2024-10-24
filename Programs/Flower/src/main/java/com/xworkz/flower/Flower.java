package com.xworkz.flower;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Flower {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/flowerdb";
        String userName="root";
        String password="Poornima!22";


        Connection connection=null;
        Statement statement=null;
        String insert="INSERT INTO Flower_table(Flower_id,Flower_name,Flower_price) VALUES(20,'tulip',45)";
        try {
            connection = DriverManager.getConnection(url, userName, password);

            statement=connection.createStatement();

            int insertedValue=statement.executeUpdate(insert);

            connection.setAutoCommit(false);
            System.out.println(insertedValue);
            if(insertedValue>0){
                System.out.println("data is added!");
            }else {
                System.out.println("data is not added!");
            }
            if(connection!=null){
                System.out.println("Connection successful");
            }else {
                System.out.println("Connection refused!");
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }

    }

}

