package com.xworkz.Kite.repository;

import com.xworkz.Kite.entity.KiteEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Repository
public class KiteRepoImpl implements KiteRepository{


    @Override
    public boolean save(KiteEntity kiteEntity) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("com");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction= entityManager.getTransaction();

        try {
            entityTransaction.begin();
            entityManager.persist(kiteEntity);
            entityTransaction.commit();

        }catch (Exception e){
           if(entityTransaction.isActive()){
               entityTransaction.rollback();
           }
        }finally {
            entityManager.close();
            entityManagerFactory.close();
        }
        return true;
    }
}
