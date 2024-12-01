package com.xworkz.Town.TownRunner;

import com.xworkz.Town.Entity.TownEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class RunnerOfTown {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("town");
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction= entityManager.getTransaction();
        try{
            entityTransaction.begin();

            List<TownEntity> townEntitiy= new ArrayList<>();
            townEntitiy.add(new TownEntity("Bengaluru","milanpatil@gmail.com",22,9389765489l));
            for (TownEntity townEntity1:townEntitiy){
                TownEntity townEntity2=new TownEntity();
                townEntity2.setEmail(townEntity1.getEmail());
                townEntity2.setTownName(townEntity1.getTownName());
                townEntity2.setAge(townEntity1.getAge());
                townEntity2.setPhone(townEntity1.getPhone());

                entityManager.persist(townEntity2);
                entityTransaction.commit();

            }

        } catch (Exception e) {
            e.printStackTrace();
           if(entityTransaction.isActive()){
                entityTransaction.rollback();
            }
        }
        finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
