package com.xworkz.Runner;

import com.xworkz.Dto.SerialEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class SerialRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("serial");
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction= entityManager.getTransaction();
        try {
            entityTransaction.begin();
            List<SerialEntity> serialEntityList=new ArrayList<>();
            serialEntityList.add(new SerialEntity("Lakshmi Baramma", 7, 8, "Colors Kannada ","Lakshmi"));

            for(SerialEntity serial:serialEntityList){
                SerialEntity serial1=new SerialEntity();
                serial1.setSerialName(serial.getSerialName());
                serial1.setMainCharacter(serial.getMainCharacter());
                serial1.setTrps(serial.getTrps());
                serial1.setWhichChannel(serial.getWhichChannel());
                serial1.setNoOfCharacters(serial.getNoOfCharacters());

                entityManager.persist(serial1);
                entityTransaction.commit();
                System.out.println("data saved");
            }
        } catch (Exception e) {
            System.out.println("data not saved");
            e.printStackTrace();
        }
        finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
