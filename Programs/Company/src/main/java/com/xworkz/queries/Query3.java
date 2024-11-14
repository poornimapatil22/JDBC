package com.xworkz.queries;

import com.xworkz.enumeration.CompnyEnum;

import java.sql.*;

public class Query3 {
    public static void main(String[] args) {
        Connection connection;
        Statement statement;

        try {
            connection = DriverManager.getConnection(CompnyEnum.URL.getValue(), CompnyEnum.USERNAME.getValue(), CompnyEnum.PASSWORD.getValue());
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT email,password FROM company_data WHERE phno=9353724643 ");

            if (resultSet.next()){
                String email= resultSet.getString("email");
                String password=resultSet.getString("password");
                System.out.println(password+" and the email is: "+email +" where phno is 9353724643");
            }
            else{
                System.out.println("Data not found!!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
