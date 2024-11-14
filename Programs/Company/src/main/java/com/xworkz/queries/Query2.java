package com.xworkz.queries;

import com.xworkz.enumeration.CompnyEnum;

import java.sql.*;

public class Query2 {
    public static void main(String[] args) {
        String sql1="SELECT adress FROM company_data WHERE name='punit' AND phno=9880496328";
        Connection connection;
        Statement statement;
        ResultSet resultSet;

        try {
            connection= DriverManager.getConnection(CompnyEnum.URL.getValue(),CompnyEnum.USERNAME.getValue(),CompnyEnum.PASSWORD.getValue());
            statement=connection.createStatement();
            resultSet=statement.executeQuery( "SELECT adress FROM company_data WHERE name='punit' AND phno=9880496328");


           if (resultSet.next()) {
               String adress = resultSet.getString("adress");
               System.out.println("User's adress with name and phoneNo: " + adress);
           } else {
               System.out.println("No user found with this adress.");
           }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
