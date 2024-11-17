package com.xworkz.Repository;

import com.xworkz.DbConnection.SignInEnum;
import com.xworkz.Dto.SignInDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SignInRepoImpl implements SignInRepo{

        @Override
        public boolean save(SignInDto signInDto) {


            boolean isValid = false;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            }catch(ClassNotFoundException e) {
                e.printStackTrace();
            }


            try {
                Connection connection = null;

                connection = DriverManager.getConnection(SignInEnum.URL.getValue(), SignInEnum.USERNAME.getValue(),SignInEnum.PASSWORD.getValue());

                PreparedStatement prest = null;

                prest = connection.prepareStatement("INSERT INTO details (username, email) VALUES (?, ?)");

                prest.setString(1, signInDto.getUserName());
                prest.setString(2, signInDto.getEmail());

                int value = prest.executeUpdate();
                if(value > 0) {
                    System.out.println("Data is saved");
                    isValid = true;
                }else {
                    isValid = false;
                }

            }catch(SQLException e) {
                e.printStackTrace();
            }
            return isValid;
        }
    }

