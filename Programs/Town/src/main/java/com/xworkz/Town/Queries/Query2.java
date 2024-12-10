package com.xworkz.Town.Queries;

import com.xworkz.Town.Entity.TownEntity;

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
                        "SELECT t FROM TownEntity t WHERE t.townName LIKE 'S%' OR t.townName LIKE 'N%' "
                                , TownEntity.class);

                List<TownEntity> emails = query.getResultList();
                for (TownEntity getemail : emails) {
                    System.out.println("Email: " + getemail.getEmail());
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


