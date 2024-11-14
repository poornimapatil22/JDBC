package com.xworkz.queries;

import com.xworkz.enumeration.CompnyEnum;

import java.sql.*;

public class Query5 {
    public static void main(String[] args) {
        try{
            Connection connection;
            connection= DriverManager.getConnection(CompnyEnum.URL.getValue(),CompnyEnum.USERNAME.getValue(),CompnyEnum.PASSWORD.getValue());
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("SELECT * FROM company.company_data");
            while (resultSet.next()){
               String name= resultSet.getString("name");
               int id=resultSet.getInt("id");
               String password=resultSet.getString("password");
               String company=resultSet.getString("compname");
                System.out.println("names are: "+name+" passwords are: "+password+" id's are: "+id+" comp names are: "+company);

            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
