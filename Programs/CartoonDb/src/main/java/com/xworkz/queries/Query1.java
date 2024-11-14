package com.xworkz.queries;

import com.xworkz.enumValues.CartoonEnum;

import java.sql.Connection;
import java.sql.DriverManager;
import com.xworkz.enumValues.CartoonEnum;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

    public class  Query1{

        public static void main(String[] args) {
            try {
                Connection connection = DriverManager.getConnection(
                        CartoonEnum.URL.getValue(),
                        CartoonEnum.USERNAME.getValue(),
                        CartoonEnum.PASSWORD.getValue());


                String query = "SELECT id, cartoonname FROM cartoondatas WHERE id > 5";
                PreparedStatement prp = connection.prepareStatement(query);
                ResultSet rs = prp.executeQuery();

                while (rs.next()) {
                    System.out.println("ID: " + rs.getInt("id") + ", Cartoon Name: " + rs.getString("cartoonname"));
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


