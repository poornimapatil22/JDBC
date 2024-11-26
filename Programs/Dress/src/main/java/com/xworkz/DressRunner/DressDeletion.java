package com.xworkz.DressRunner;

import com.xworkz.DressDto.DressEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DressDeletion {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("dress");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();


        try{
            entityTransaction.begin();
            Integer id=3;
            DressEntity value=entityManager.find(DressEntity.class,id);
            entityManager.remove(value);
            entityTransaction.commit();

        }catch (Exception e){
            System.out.println("not deleted");
            e.printStackTrace();

        }finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
