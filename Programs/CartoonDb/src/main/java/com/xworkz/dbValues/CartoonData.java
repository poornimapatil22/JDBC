package com.xworkz.dbValues;

import com.xworkz.dto.CartoonDto;
import com.xworkz.enumValues.CartoonEnum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CartoonData {

    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement prp = null;

        try {
           
            connection = DriverManager.getConnection(
                    CartoonEnum.URL.getValue(),
                    CartoonEnum.USERNAME.getValue(),
                    CartoonEnum.PASSWORD.getValue());

          
            String insertSQL = "INSERT INTO cartoondatas (id, cartoonname, category, creator, yearstarted, episodes, maincharacter, voiceactor, genre, isongoing) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

          
            CartoonDto cartoon1 = new CartoonDto(1, "Motu Patlu", "Comedy, Adventure", "Niraj Vikram", 2012,500,"motu","saurav panday","action",true);
            prp = connection.prepareStatement(insertSQL);
            prp.setInt(1, cartoon1.getId());
            prp.setString(2, cartoon1.getCartoonName());
            prp.setString(3, cartoon1.getCategory());
            prp.setString(4, cartoon1.getCreator());
            prp.setInt(5, cartoon1.getYearStarted());
            prp.setInt(6, cartoon1.getEpisodes());  
            prp.setString(7, cartoon1.getMainCharacter());
            prp.setString(8, cartoon1.getVoiceActor());
            prp.setString(9, cartoon1.getGenre());
            prp.setBoolean(10, cartoon1.isOngoing());
            prp.executeUpdate();


            CartoonDto cartoon2 = new CartoonDto(2, "Chhota Bheem", "Action, Adventure", "Rajiv Chilaka", 2008,600,"bheem","vaishnavi","action",true);
            prp.setInt(1, cartoon2.getId());
            prp.setString(2, cartoon2.getCartoonName());
            prp.setString(3, cartoon2.getCategory());
            prp.setString(4, cartoon2.getCreator());
            prp.setInt(5, cartoon2.getYearStarted());
            prp.setInt(6, cartoon2.getEpisodes());
            prp.setString(7, cartoon1.getMainCharacter());
            prp.setString(8, cartoon2.getGenre());
            prp.setString(9, cartoon2.getVoiceActor());
            prp.setBoolean(10, cartoon2.isOngoing());
            prp.executeUpdate();

            CartoonDto cartoon3 = new CartoonDto(3, "Shin Chan", "Comedy, Family", "Yoshito Usui", 2006,1200,"Shin chan","Rajesh kava","Slice Of Life",true);
            prp.setInt(1, cartoon3.getId());
            prp.setString(2, cartoon3.getCartoonName());
            prp.setString(3, cartoon3.getCategory());
            prp.setString(4, cartoon3.getCreator());
            prp.setInt(5, cartoon3.getYearStarted());
            prp.setInt(6, cartoon3.getEpisodes());
            prp.setString(7, cartoon3.getMainCharacter());
            prp.setString(8, cartoon1.getVoiceActor());
            prp.setString(9, cartoon3.getGenre());
            prp.setBoolean(10, cartoon3.isOngoing());
            prp.executeUpdate();


            CartoonDto cartoon4 = new CartoonDto(4, "Doraemon", "Science Fiction, Comedy", "Fujiko F. Fujio", 2005,2000,"doreamon","sumit","science fiction",true);
            prp.setInt(1, cartoon4.getId());
            prp.setString(2, cartoon4.getCartoonName());
            prp.setString(3, cartoon4.getCategory());
            prp.setString(4, cartoon4.getCreator());
            prp.setInt(5, cartoon4.getYearStarted());
            prp.setInt(6, cartoon4.getEpisodes());
            prp.setString(7, cartoon4.getMainCharacter());
            prp.setString(8, cartoon4.getVoiceActor());
            prp.setString(9, cartoon4.getGenre());
            prp.setBoolean(10, cartoon4.isOngoing());
            prp.executeUpdate();


            CartoonDto cartoon5 = new CartoonDto(5, "The Adventures of Tenali Raman", "Historical, Comedy, Adventure", "Green Gold Animation", 2003,200,"tenali raman","saurav","comedy",false);
            prp.setInt(1, cartoon5.getId());
            prp.setString(2, cartoon5.getCartoonName());
            prp.setString(3, cartoon5.getCategory());
            prp.setString(4, cartoon5.getCreator());
            prp.setInt(5, cartoon5.getYearStarted());
            prp.setInt(6, 200);
            prp.setString(7, cartoon5.getMainCharacter());
            prp.setString(8, cartoon5.getVoiceActor());
            prp.setString(9, cartoon5.getGenre());
            prp.setBoolean(10, cartoon5.isOngoing());
            prp.executeUpdate();


            CartoonDto cartoon6 = new CartoonDto(6, "Little Singham", "Action, Comedy, Adventure", "Rohit Shetty", 2018,100,"little singham","deepa","action",true);
            prp.setInt(1, cartoon6.getId());
            prp.setString(2, cartoon6.getCartoonName());
            prp.setString(3, cartoon6.getCategory());
            prp.setString(4, cartoon6.getCreator());
            prp.setInt(5, cartoon6.getYearStarted());
            prp.setInt(6, 100);
            prp.setString(7, cartoon6.getMainCharacter());
            prp.setString(8, cartoon6.getVoiceActor());
            prp.setString(9, cartoon6.getGenre());
            prp.setBoolean(10, cartoon6.isOngoing());
            prp.executeUpdate();


            CartoonDto cartoon7 = new CartoonDto(7, "Bal Ganesh", "Mythology, Comedy", "Green Gold Animation", 2007,100,"Ganesh","various","mythology",false);
            prp.setInt(1, cartoon7.getId());
            prp.setString(2, cartoon7.getCartoonName());
            prp.setString(3, cartoon7.getCategory());
            prp.setString(4, cartoon7.getCreator());
            prp.setInt(5, cartoon7.getYearStarted());
            prp.setInt(6, 100);
            prp.setString(7, cartoon7.getMainCharacter());
            prp.setString(8, cartoon7.getVoiceActor());
            prp.setString(9, cartoon7.getGenre());
            prp.setBoolean(10, cartoon7.isOngoing());
            prp.executeUpdate();


            CartoonDto cartoon8 = new CartoonDto(8, "Krishna", "Mythological, Adventure", "Mukesh Khanna", 1993,200,"krishna","mukhesh","adventure",false);
            prp.setInt(1, cartoon8.getId());
            prp.setString(2, cartoon8.getCartoonName());
            prp.setString(3, cartoon8.getCategory());
            prp.setString(4, cartoon8.getCreator());
            prp.setInt(5, cartoon8.getYearStarted());
            prp.setInt(6, 200);
            prp.setString(7, cartoon8.getMainCharacter());
            prp.setString(8, cartoon8.getVoiceActor());
            prp.setString(9, cartoon8.getGenre());
            prp.setBoolean(10, cartoon8.isOngoing());
            prp.executeUpdate();


            CartoonDto cartoon9 = new CartoonDto(9, "Mahi Way", "Comedy, Drama", "YRF TV", 2010,60,"mahi","kajal","comedy",false);
            prp.setInt(1, cartoon9.getId());
            prp.setString(2, cartoon9.getCartoonName());
            prp.setString(3, cartoon9.getCategory());
            prp.setString(4, cartoon9.getCreator());
            prp.setInt(5, cartoon9.getYearStarted());
            prp.setInt(6, 60);
            prp.setString(7, cartoon9.getMainCharacter());
            prp.setString(8, cartoon9.getVoiceActor());
            prp.setString(9, cartoon9.getGenre());
            prp.setBoolean(10, cartoon9.isOngoing());
            prp.executeUpdate();


            CartoonDto cartoon10 = new CartoonDto(10, "Baba Jani", "Mythological, Comedy", "IAD", 2000,50,"baba jani","rajesh","comedy,Mythology",false);
            prp.setInt(1, cartoon10.getId());
            prp.setString(2, cartoon10.getCartoonName());
            prp.setString(3, cartoon10.getCategory());
            prp.setString(4, cartoon10.getCreator());
            prp.setInt(5, cartoon10.getYearStarted());
            prp.setInt(6, 50);
            prp.setString(7, "Baba Jani");
            prp.setString(8, "Rajesh Kava");
            prp.setString(9, "Mythology, Comedy");
            prp.setBoolean(10, false);
            prp.executeUpdate();



        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

