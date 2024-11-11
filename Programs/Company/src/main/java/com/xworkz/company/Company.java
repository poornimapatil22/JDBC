package com.xworkz.company;

import java.sql.*;

public class Company {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/company";
        String userName = "root";
        String password = "Poornima!22";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet=null;

        //String insert="INSERT INTO company_data(id,name,email,phno,compname,password,salary,joiningdate,adress,workhour)" +
               // " VALUES(7,'shreya','shreya@gmail.com',8084567898,'abcd','shreyalende',55000,'2025','jaynagar',9.0)";
        String sql="SELECT name FROM company_data WHERE email = 'poornima@gmail.com' AND password = 'poornima!22'";
        String sql1="SELECT adress FROM company_data WHERE name='punit' AND phno=9880496328";
        String sql2="SELECT email , password FROM company_data WHERE phno=9353724643";
        String sql3="SELECT email ,password FROM company_data WHERE phno=9999234565 AND name='abhi'";
        String sql4="SELECT name FROM company_data WHERE id>10";
       try {
            connection = DriverManager.getConnection(url, userName, password);

            statement = connection.createStatement();


                 resultSet=statement.executeQuery(sql);
                 if (resultSet.next()) {
                String name = resultSet.getString("name");
                System.out.println("User's name with email and password: " + name);
            } else {
                System.out.println("No user found with the provided email and password.");
            }

           resultSet=statement.executeQuery(sql1);
           if (resultSet.next()) {
               String adress = resultSet.getString("adress");
               System.out.println("User's adress with name and phoneNo: " + adress);
           } else {
               System.out.println("No user found with this adress.");
           }

           resultSet=statement.executeQuery(sql2);
           if (resultSet.next()) {
               String email = resultSet.getString("email");
               System.out.println("User's email and password with phNo: " + email);
               String password1=resultSet.getString("password");
               System.out.println("email and password is:"+password1);
           } else {
               System.out.println("No user found with this email.");
           }


           resultSet=statement.executeQuery(sql3);
           if (resultSet.next()) {
               String email1 = resultSet.getString("email");
               System.out.println("User's email: " + email1);
               String password1=resultSet.getString("password");
               System.out.println("email and password where phone no and :"+password1);
           } else {
               System.out.println("No user found with this phonenumber.");
           }

           resultSet=statement.executeQuery(sql4);
           if (resultSet.next()) {
               String name = resultSet.getString("name");
               System.out.println("User's  name where id>10: " + name);
           } else {
               System.out.println("No user found with this id.");
           }


           if (connection != null) {
                System.out.println("Connection successful");
            } else {
                System.out.println("Connection refused!");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
