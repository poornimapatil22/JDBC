package com.xworkz.Employee.Service;

import com.xworkz.Employee.Entity.EmployeeCard;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepoImpl implements EmployeeRepo{
    @Override
    public boolean save(EmployeeCard er) {
        EntityManagerFactory eMF = Persistence.createEntityManagerFactory("TestPersistence");
        EntityManager eM = eMF.createEntityManager();
        EntityTransaction eT = eM.getTransaction();
        List<EmployeeCard> employeeCard = new ArrayList<>();
        try {
            eT.begin();
            for (EmployeeCard card : employeeCard) {
                eM.persist(card);
                System.out.println(card);
            }
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
}
