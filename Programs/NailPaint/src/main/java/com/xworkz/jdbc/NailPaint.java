package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NailPaint {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/nailPaint";
        String userName = "root";
        String password = "Poornima!22";

        Connection connection = DriverManager.getConnection(url, userName, password);
        if (connection != null) {
            System.out.println("connection successful to DB nailPaint");
        }
        else {
            System.out.println("connection failed");
        }


    }
}






