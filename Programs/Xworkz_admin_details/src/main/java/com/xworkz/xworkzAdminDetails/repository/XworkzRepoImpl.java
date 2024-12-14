package com.xworkz.xworkzAdminDetails.repository;

import com.xworkz.xworkzAdminDetails.dto.XworkzDto;
import com.xworkz.xworkzAdminDetails.entity.XworkzEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Repository
public class XworkzRepoImpl implements XworkzRepo{
    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public boolean save(XworkzEntity xworkzEntity) {
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction= entityManager.getTransaction();
        try {
            entityTransaction.begin();
            entityManager.persist(xworkzEntity);
            entityTransaction.commit();

        }catch (Exception e){
            if(entityTransaction.isActive()){
                entityTransaction.rollback();
            }
        }finally {
            entityManager.close();

        }
        return true;
    }
}
