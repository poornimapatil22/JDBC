package com.xworkz.Town.Queries;

import javax.persistence.*;
import java.util.List;

public class Query2 {

        public static void main(String[] args) {
            EntityManagerFactory entityManagerFcatory = Persistence.createEntityManagerFactory("town");
            EntityManager entityManager = entityManagerFcatory.createEntityManager();
            EntityTransaction entityTransaction = entityManager.getTransaction();

            try {
                entityTransaction.begin();
                Query query = entityManager.createQuery(
                        "SELECT t.email FROM TownEntity t WHERE t.townName LIKE 'S%' OR t.townName LIKE 'N%' "
                );
                List<String> emails = query.getResultList();
                for (String email : emails) {
                    System.out.println("Email: " + email);
                    entityTransaction.commit();
                }

            } catch (Exception e){
                e.printStackTrace();

            }finally{
                entityManager.close();
                entityManagerFcatory.close();
            }

        }
    }


