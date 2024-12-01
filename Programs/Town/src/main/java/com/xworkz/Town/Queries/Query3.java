package com.xworkz.Town.Queries;

import com.xworkz.Town.Entity.TownEntity;

import javax.persistence.*;
import java.util.List;

public class Query3 {


        public static void main(String[] args) {
            EntityManagerFactory entityManagerFcatory = Persistence.createEntityManagerFactory("town");
            EntityManager entityManager = entityManagerFcatory.createEntityManager();
            EntityTransaction entityTransaction = entityManager.getTransaction();

            try {
                entityTransaction.begin();
                Query query = entityManager.createQuery("SELECT t FROM TownEntity t");
                List<TownEntity> resultList = query.getResultList();
                for (TownEntity town : resultList) {
                    System.out.println("Town Name: " + town.getTownName() + ", Email: " + town.getEmail() + ", Age: " + town.getAge() + ", Phone: " + town.getPhone());

                }
                entityTransaction.commit();

            } catch (Exception e){
                e.printStackTrace();

            }finally{
                entityManager.close();
                entityManagerFcatory.close();
            }

        }
    }



