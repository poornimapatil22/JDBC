package com.xworkz.Town.Queries;

import javax.persistence.*;

public class Query1 {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("town");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {

            entityTransaction.begin();


            Query query = entityManager.createQuery(
                    "UPDATE TownEntity t SET t.townName = :townName, t.email = :email WHERE t.phone = :phone"
            );


            query.setParameter("townName", "Bengaluru");
            query.setParameter("email", "poornimapatil@gmail.com");
            query.setParameter("phone", 9353724646L);


            int updatedCount = query.executeUpdate();
            System.out.println(updatedCount + " rows updated.");


            entityTransaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
            if (entityTransaction.isActive()) {
                entityTransaction.rollback();
            }
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
