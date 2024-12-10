package com.xworkz.Resto.Adder;

import com.xworkz.Resto.Entity.RestoEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RestoInsert {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("resto");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction= entityManager.getTransaction();
        List<RestoEntity> entity=new ArrayList<>();
        entity.add(new RestoEntity("Taj",(short) 5,'M',"Mumbai",true,500.0,9998887878l,18,"Best Hotel"));
        entity.add(new RestoEntity("Fransisco",(short) 3,'F',"London",false,10000,999999878l,24,"Worst Hotel"));
        entity.add(new RestoEntity("Sudarshan",(short) 4,'M',"Bengaluru",true,500.0,8898887878l,15,"Best Hotel"));
        entity.add(new RestoEntity("Ambika",(short) 5,'M',"Goa",true,50.0,7777787878l,12,"Avg Hotel"));
        entity.add(new RestoEntity("Tira",(short) 4,'f',"Mumbai",true,800.0,9998887878l,0,"Best Hotel"));
        entity.add(new RestoEntity("Taj",(short) 5,'M',"Mirapur",true,50.0,66668887878l,0,"Best Hotel"));
        entity.add(new RestoEntity("Taj",(short) 4,'f',"jaipur",false,7.0,798887878l,0,"Best Hotel"));
        entity.add(new RestoEntity("Taj",(short) 5,'f',"varanasi",true,200.0,88898887878l,0,"Best Hotel"));
        entity.add(new RestoEntity("Taj",(short) 2,'M',"odisa",false,300.0,767887878l,0,"Best Hotel"));
        entity.add(new RestoEntity("monika",(short) 3,'f',"Hubbali",true,20,6363898888l,15,"good hotel"));

        try {
            entityTransaction.begin();
        for (RestoEntity res:entity){
                entityManager.merge(res);
        }
            entityTransaction.commit();
            System.out.println("data saved");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
