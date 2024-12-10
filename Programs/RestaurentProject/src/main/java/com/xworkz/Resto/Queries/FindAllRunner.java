package com.xworkz.Resto.Queries;

import com.xworkz.Resto.Entity.RestoEntity;

import javax.persistence.*;
import java.util.List;

public class FindAllRunner{

    public static void main(String[] args) {


        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("resto");
        EntityManager eManager = emFactory.createEntityManager();
        EntityTransaction eTrans = eManager.getTransaction();

        Query query = eManager.createNamedQuery("findAll");
        List<RestoEntity> list = query.getResultList();
        //list.forEach(n -> System.out.println(n));


        for (RestoEntity dto : list) {
            System.out.println(dto.getAddress()+" ,"+dto.getReview()+" ,"+dto.getRestaurentName()+" ,"+dto.getEachMenuAvgPrice()+" ,"+dto.getOpeningHours());
        }


        try {
            eTrans.begin();
            eTrans.commit();

        } catch (Exception e) {
            if (eTrans.isActive()) {
                eTrans.rollback();
            }
        } finally {
            eManager.close();
            emFactory.close();
        }


    }
}
