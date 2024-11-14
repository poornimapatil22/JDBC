package com.xworkz.queries;

import com.xworkz.enumeration.CompnyEnum;

import java.sql.*;

public class Query1 {
    public static void main(String[] args) {


        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet=null;


        String sql="SELECT name FROM company_data WHERE email = 'poornima@gmail.com' AND password = 'poornima!22'";

       try {
            connection = DriverManager.getConnection(CompnyEnum.URL.getValue(), CompnyEnum.USERNAME.getValue(), CompnyEnum.PASSWORD.getValue());

            statement = connection.createStatement();


                 resultSet=statement.executeQuery(sql);
                 if (resultSet.next()) {
                String name = resultSet.getString("name");
                System.out.println("User's name with email and password: " + name);
            } else {
                System.out.println("No user found with the provided email and password.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
