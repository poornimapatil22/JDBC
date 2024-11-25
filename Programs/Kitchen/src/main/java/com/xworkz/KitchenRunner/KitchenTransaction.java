package com.xworkz.KitchenRunner;

import com.xworkz.Dto.KitchenDto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class KitchenTransaction {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("kitchen");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction transaction=entityManager.getTransaction();
        try {
            transaction.begin();
            KitchenDto kitchenDto=new KitchenDto();
            kitchenDto.setId(5);
            kitchenDto.setKitchenCost(5550);
            kitchenDto.setClean(false);
            kitchenDto.setKitchenThingsName("vessel");
            kitchenDto.setColour("pink");
            kitchenDto.setKitchenThingsBrand("sahara");
            kitchenDto.setKitchenThingCost(50);
            kitchenDto.setNoOfThings(50);
            kitchenDto.setSpaceInMeter(600);
            kitchenDto.setShape("square");
            kitchenDto.setWhoOwns("women");
            entityManager.persist(kitchenDto);
            transaction.commit();
            System.out.println("data saved into the db!");
        }catch (Exception e){
            System.out.println("data not saved into the db!");
            e.printStackTrace();
        }
        finally {
            entityManager.close();
            entityManagerFactory.close();

        }

    }
}