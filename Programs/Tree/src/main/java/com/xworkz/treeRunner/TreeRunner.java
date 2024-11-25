package com.xworkz.treeRunner;

import com.xworkz.Dto.TreeDto;

import javax.persistence.*;


public class TreeRunner {

    public  static  void main(String[] args){
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("tree");
          EntityManager entityManager=  emf.createEntityManager();
        EntityTransaction et=entityManager.getTransaction();

        try {
            et.begin();
            TreeDto dto=new TreeDto();
            dto.setTreeName("moringa");
            dto.setFlowersCount(55.0);
            dto.setTall(true);
            dto.setIsBig(70.0);
            dto.setTreeHeight(80.0);
            dto.setUnderGround(false);
            dto.setId(5);

            entityManager.persist(dto);
            et.commit();
            System.out.println("data entered");

        }
        catch (RuntimeException e){
            System.out.println("not entered");
        e.printStackTrace();
        }
        finally {
        entityManager.close();
        emf.close();
        }
    }
}
