package com.xworkz.movieDetails;

import java.sql.*;

public class MovieData {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/movie";
        String userName = "root";
        String password = "Poornima!22";

        Connection connection = null;
        Statement statement = null;



        String sql="SELECT * FROM movie.movie_data;";
        try {
            connection = DriverManager.getConnection(url, userName, password);

            statement = connection.createStatement();


            ResultSet resultSet=statement.executeQuery(sql);

            connection.setAutoCommit(false);


            while (resultSet.next()){
                int id = resultSet.getInt("movie_id");
                String movieName = resultSet.getString("movie_name");
                String villain = resultSet.getString("movie_villain");


                System.out.println("ID: " + id + ", Movie Name: " + movieName + ", villain: " + villain);
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