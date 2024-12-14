package com.xworkz.xworkzAdminDetails.service;

import com.xworkz.xworkzAdminDetails.dto.XworkzDto;
import com.xworkz.xworkzAdminDetails.entity.XworkzEntity;
import com.xworkz.xworkzAdminDetails.repository.XworkzRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class XworkzServiceImpl implements XworkzService {

    @Autowired
    XworkzRepo xworkzRepo;

    @Override
    public boolean validAndSave(XworkzDto xworkzDto) {


        if (xworkzDto.getName() == null || xworkzDto.getName().length() < 5) {
            System.out.println("name invalid");
            return false;
        }


        if (xworkzDto.getAge() == null || xworkzDto.getAge() <= 18) {
            System.out.println("age invalid");
            return false;
        }


        if (xworkzDto.getPassword() == null || xworkzDto.getPassword().length() < 7 || !xworkzDto.getPassword().equals(xworkzDto.getConfirmPassword())) {
            System.out.println("password invalid");
            return false;
        }


        if (xworkzDto.getEmail() == null || !xworkzDto.getEmail().contains("@") || !xworkzDto.getEmail().endsWith("gmail.com")) {
            System.out.println("confirm password invalid");
            return false;
        }


        if (xworkzDto.getMobNo() == null || xworkzDto.getMobNo().toString().length() != 10 || !xworkzDto.getMobNo().toString().startsWith("9")) {
            System.out.println("mob no invalid");
            return false;
        }


        XworkzEntity xworkzEntity = new XworkzEntity();
        xworkzEntity.setAge(xworkzDto.getAge());
        xworkzEntity.setConfirmPassword(xworkzDto.getConfirmPassword());
        xworkzEntity.setPassword(xworkzDto.getPassword());
        xworkzEntity.setMobNo(xworkzDto.getMobNo());
        xworkzEntity.setName(xworkzDto.getName());
        xworkzEntity.setEmail(xworkzDto.getEmail());


        xworkzRepo.save(xworkzEntity);

        return true;
    }
}
