package com.xworkz.Town.Queries;

import javax.persistence.*;
import java.util.List;

public class Query4 {

        public static void main(String[] args) {
            EntityManagerFactory entityManagerFcatory = Persistence.createEntityManagerFactory("town");
            EntityManager entityManager = entityManagerFcatory.createEntityManager();
            EntityTransaction entityTransaction = entityManager.getTransaction();

            try {
                entityTransaction.begin();
                Query query = entityManager.createQuery(
                        "SELECT t.townName, t.phone FROM TownEntity t WHERE t.age > 15"
                );
                List<Object[]> results = query.getResultList();
                for (Object[] result : results) {
                    String townName = (String) result[0];
                    long phone = (long) result[1];
                    System.out.println("Town Name: " + townName + ", Phone: " + phone);

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




