package com.xworkz.dbValues;


import com.xworkz.enumValues.CartoonEnum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class CartoonData {



        public static void main(String[] args) {

            String insertSQL = "INSERT INTO cartoondatas (id, cartoonname, category, creator, yearstarted, episodes, maincharacter, voiceactor, genre, isongoing) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?,?, ?)";
    try{
            Connection connection = DriverManager.getConnection(
                    CartoonEnum.URL.getValue(),
                    CartoonEnum.USERNAME.getValue(),
                    CartoonEnum.PASSWORD.getValue());


                PreparedStatement prp = connection.prepareStatement(insertSQL);


                prp.setInt(1, 1);
                prp.setString(2, "Motu Patlu");
                prp.setString(3, "Comedy, Adventure");
                prp.setString(4, "Niraj Vikram");
                prp.setInt(5, 2012);
                prp.setInt(6, 500);
                prp.setString(7, "Motu, Patlu");
                prp.setString(8, "Saurav Padhy");
                prp.setString(9, "Animation, Comedy");
                prp.setBoolean(10, true);
                prp.addBatch();

                prp.setInt(1, 2);
                prp.setString(2, "Chhota Bheem");
                prp.setString(3, "Action, Adventure");
                prp.setString(4, "Rajiv Chilaka");
                prp.setInt(5, 2008);
                prp.setInt(6, 1000);
                prp.setString(7, "Bheem");
                prp.setString(8, "Vaishnavi Mahant");
                prp.setString(9, "Action, Adventure");
                prp.setBoolean(10, true);
                prp.addBatch();

                prp.setInt(1, 3);
                prp.setString(2, "Shin Chan");
                prp.setString(3, "Comedy, Family");
                prp.setString(4, "Yoshito Usui");
                prp.setInt(5, 2006);
                prp.setInt(6, 1200);
                prp.setString(7, "Shin Chan");
                prp.setString(8, "Rajesh Kava");
                prp.setString(9, "Comedy, Slice of Life");
                prp.setBoolean(10, true);
                prp.addBatch();

                prp.setInt(1, 4);
                prp.setString(2, "Doraemon");
                prp.setString(3, "Science Fiction, Comedy");
                prp.setString(4, "Fujiko F. Fujio");
                prp.setInt(5, 2005);
                prp.setInt(6, 2000);
                prp.setString(7, "Nobita, Doraemon");
                prp.setString(8, "Sumit Arora");
                prp.setString(9, "Science Fiction, Comedy");
                prp.setBoolean(10, true);
                prp.addBatch();

                prp.setInt(1, 5);
                prp.setString(2, "The Adventures of Tenali Raman");
                prp.setString(3, "Historical, Comedy, Adventure");
                prp.setString(4, "Green Gold Animation");
                prp.setInt(5, 2003);
                prp.setInt(6, 200);
                prp.setString(7, "Tenali Raman");
                prp.setString(8, "Saurabh Pandey");
                prp.setString(9, "Comedy, Adventure");
                prp.setBoolean(10, false);
                prp.addBatch();

                prp.setInt(1, 6);
                prp.setString(2, "Little Singham");
                prp.setString(3, "Action, Comedy, Adventure");
                prp.setString(4, "Rohit Shetty");
                prp.setInt(5, 2018);
                prp.setInt(6, 100);
                prp.setString(7, "Little Singham");
                prp.setString(8, "Deepa Shankar");
                prp.setString(9, "Action, Comedy");
                prp.setBoolean(10, true);
                prp.addBatch();

                prp.setInt(1, 7);
                prp.setString(2, "Bal Ganesh");
                prp.setString(3, "Mythology, Comedy");
                prp.setString(4, "Green Gold Animation");
                prp.setInt(5, 2007);
                prp.setInt(6, 100);
                prp.setString(7, "Lord Ganesh");
                prp.setString(8, "Various");
                prp.setString(9, "Mythology, Comedy");
                prp.setBoolean(10, false);
                prp.addBatch();

                prp.setInt(1, 8);
                prp.setString(2, "Krishna");
                prp.setString(3, "Mythological, Adventure");
                prp.setString(4, "Mukesh Khanna");
                prp.setInt(5, 1993);
                prp.setInt(6, 200);
                prp.setString(7, "Krishna");
                prp.setString(8, "Mukesh Khanna");
                prp.setString(9, "Mythology, Adventure");
                prp.setBoolean(10, false);
                prp.addBatch();

                prp.setInt(1, 9);
                prp.setString(2, "Mahi Way");
                prp.setString(3, "Comedy, Drama");
                prp.setString(4, "YRF TV");
                prp.setInt(5, 2010);
                prp.setInt(6, 60);
                prp.setString(7, "Mahi");
                prp.setString(8, "Kajal Jain");
                prp.setString(9, "Comedy, Drama");
                prp.setBoolean(10, false);
                prp.addBatch();

                prp.setInt(1, 10);
                prp.setString(2, "Baba Jani");
                prp.setString(3, "Mythological, Comedy");
                prp.setString(4, "IAD");
                prp.setInt(5, 2000);
                prp.setInt(6, 100);
                prp.setString(7, "Baba Jani");
                prp.setString(8, "Pavan Malhotra");
                prp.setString(9, "Mythological, Comedy");
                prp.setBoolean(10, false);
                prp.addBatch();

                prp.executeBatch();


                } catch (SQLException e) {
                    e.printStackTrace();
                }


        }
    }


