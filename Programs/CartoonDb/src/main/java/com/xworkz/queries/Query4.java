package com.xworkz.queries;



import com.xworkz.enumValues.CartoonEnum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Query4 {

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                    CartoonEnum.URL.getValue(),
                    CartoonEnum.USERNAME.getValue(),
                    CartoonEnum.PASSWORD.getValue());


            String query = "SELECT maincharacter, voiceactor FROM cartoondatas";
            PreparedStatement prp = connection.prepareStatement(query);
            ResultSet rs = prp.executeQuery();

            while (rs.next()) {
                System.out.println("Main Character: " + rs.getString("maincharacter") +
                        ", Voice Actor: " + rs.getString("voiceactor"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
