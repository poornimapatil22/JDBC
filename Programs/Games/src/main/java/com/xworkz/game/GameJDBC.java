package com.xworkz.game;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GameJDBC {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/game";
        String userName="root";
        String password="Poornima!22";


        Connection connection=null;
        Statement statement=null;
        String insertion="INSERT INTO game_table(Game_id,Game_name) VALUES(20,'ladder and snake')";

        try{
            connection= DriverManager.getConnection(url,userName,password);
            statement=connection.createStatement();
            int value=statement.executeUpdate(insertion);
            if(value>0){
                System.out.println("data added!!");
                System.out.println(value);
            }else{
                System.out.println("data is not added!");
            }
            if(connection!=null) {
                System.out.println("connected to db");
            }
                else{
                    System.out.println("not connected to db");
                }

        }
        catch (SQLException e){
            e.printStackTrace();
        }



    }
}
