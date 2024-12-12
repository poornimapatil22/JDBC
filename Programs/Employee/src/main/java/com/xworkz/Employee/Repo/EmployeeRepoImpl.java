package com.xworkz.Employee.Service;

import com.xworkz.Employee.Entity.EmployeeCard;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeRepoImpl implements EmployeeRepo{
    @Override
    public boolean save(EmployeeCard er) {
        System.out.println(er);
        EntityManagerFactory eMF = Persistence.createEntityManagerFactory("TestPersistence");
        EntityManager eM = eMF.createEntityManager();
        EntityTransaction eT = eM.getTransaction();

        try {
            eT.begin();
           // eM.persist(er);
            eT.commit();

        } catch (Exception e) {
            if (eT.isActive()) {
                eT.rollback();
                System.out.println("Transaction rolled back due to an error!");
            }
            e.printStackTrace();
        } finally {

            eM.close();
            eMF.close();
        }

        return false;
    }

    @Override
    public List<EmployeeCard> findAll() {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPersistence");
        EntityManager em= emf.createEntityManager();
        EntityTransaction et=  em.getTransaction();

        List<EmployeeCard> list=null;
        Query query=em.createNamedQuery("findAll");
        list= query.getResultList();
        for (EmployeeCard employeeCard : list) {
            System.out.println("EmployeeEntity:"+employeeCard);
        }
        try {
            et.begin();
            et.commit();
        }catch (Exception e) {
            if(et.isActive()) {
                et.rollback();
                e.printStackTrace();
            }
        }finally {
            emf.close();
            em.close();
        }
        return list;
    }


    @Override
    public List<Object[]> getById(int id) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPersistence");
        EntityManager em= emf.createEntityManager();
        EntityTransaction et=  em.getTransaction();

        List<Object[]> list1=null;
        Query query=em.createNamedQuery("getById");
        query.setParameter("id", id);
        list1= query.getResultList();
        for (Object[] objects : list1) {
            System.out.println("name:"+objects[0]);
            System.out.println("email:"+objects[1]);
        }
        try {
            et.begin();
            et.commit();
        }catch (Exception e) {
            if(et.isActive()) {
                et.rollback();
                e.printStackTrace();
            }
        }finally {
            emf.close();
            em.close();
        }
        return list1;

    }

    @Override
    public List<EmployeeCard> getAllByNameAndEmail(String email, String name) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPersistence");
        EntityManager em= emf.createEntityManager();
        EntityTransaction et=  em.getTransaction();

        List<EmployeeCard> list2=null;
        Query query=em.createNamedQuery("getAllbyName&Email");
        query.setParameter("email", email);
        query.setParameter("name", name);
        list2= query.getResultList();
        for (EmployeeCard employee : list2) {
            System.out.println("EmployeeEntity"+employee);
        }
        try {
            et.begin();
            et.commit();
        }catch (Exception e) {
            if(et.isActive()) {
                et.rollback();
                e.printStackTrace();
            }
        }finally {
            emf.close();
            em.close();
        }

        return list2;
    }


}
