package com.xworkz.DressRunner;

import com.xworkz.DressDto.DressEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DressRunner {


    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("dress");
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        EntityTransaction transaction=entityManager.getTransaction();


        try{
            transaction.begin();
            DressEntity dressEntity= new DressEntity(3,"different",700,11,"Tshirt","allen solly");
            entityManager.merge(dressEntity);

            System.out.println("data saved");
            transaction.commit();


        }
        catch (Exception e){
            if (transaction.isActive()) {
                transaction.rollback();
            }
            System.out.println("data not saved");
            e.printStackTrace();
        }finally {
            entityManager.close();
            entityManagerFactory.close();
        }





    }
}
