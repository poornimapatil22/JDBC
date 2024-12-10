package com.xworkz.Employee.Service;

import com.xworkz.Employee.Entity.EmployeeCard;

import java.util.List;

public interface EmployeeRepo {
    boolean save(EmployeeCard er);
    List<EmployeeCard> findAll();
    List<Object[]> getById(int id);
    List<EmployeeCard> getAllByNameAndEmail(String email,String name);
}
