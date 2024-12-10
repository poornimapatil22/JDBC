package com.xworkz.Town.Queries;

import com.xworkz.Town.Entity.TownEntity;

import javax.persistence.*;
import java.util.List;

public class Query5 {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFcatory = Persistence.createEntityManagerFactory("town");
        EntityManager entityManager = entityManagerFcatory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            entityTransaction.begin();


        } catch (Exception e){
            e.printStackTrace();

        }finally{
            entityManager.close();
            entityManagerFcatory.close();
        }

    }
}
