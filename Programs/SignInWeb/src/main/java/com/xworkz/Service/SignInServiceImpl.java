package com.xworkz.Service;

import com.xworkz.Dto.SignInDto;
import com.xworkz.Repository.SignInRepoImpl;

public class SignInServiceImpl implements SignInService {

        @Override
        public boolean save(SignInDto signInDto) {

            boolean isvalid = true;

            if( signInDto == null) {
                isvalid = false;
            }
            if( signInDto.getUserName().length() < 3 || signInDto.getUserName().isEmpty()) {
                System.out.println("data is incorrect");
                isvalid = false;
            }

            if(!( signInDto.getEmail().contains("@") &&  signInDto.getEmail().endsWith(".com")|| signInDto.getEmail().endsWith(".in"))) {
                System.out.println("Dtat is incorrect");
                isvalid = false;
            }

            if(isvalid) {
                SignInRepoImpl signInRepoImpl = new SignInRepoImpl();
                return signInRepoImpl.save(signInDto);
            }else {
                return false;
            }

        }
    }

