package com.xworkz.queries;

import com.xworkz.enumeration.CompnyEnum;

import java.sql.*;

public class Query4 {
    public static void main(String[] args) {
        try {
        Connection connection;
        connection= DriverManager.getConnection(CompnyEnum.URL.getValue(),CompnyEnum.USERNAME.getValue(),CompnyEnum.PASSWORD.getValue());
            Statement statement;
            statement=connection.createStatement();
            ResultSet resultSet;
            resultSet=statement.executeQuery("SELECT name FROM company_data WHERE id>10");
           while (resultSet.next()){
                String name=resultSet.getString("name");
                System.out.println("The name where id>10 is: "+name);
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }


    }
}
