package com.xworkz.Employee.Service;

import com.xworkz.Employee.Entity.EmployeeCard;

import java.util.Collections;
import java.util.List;

public class EmployeeServiceImpl  implements EmployeeService{
    @Override
    public boolean validAndSave(EmployeeCard es) {
        System.out.println(es);
        EmployeeRepo employeeRepo=new EmployeeRepoImpl();
        employeeRepo.save(es);
        return false;
    }

    @Override
    public List<EmployeeCard> findAll() {
        EmployeeRepo repo=new EmployeeRepoImpl();
        List<EmployeeCard> list=repo.findAll();
        return list;
    }

    @Override
    public List<Object[]> getById(int id) {
       EmployeeRepo repo=new EmployeeRepoImpl();
      List<Object[]> list=repo.getById(id);
       return list;
    }

    @Override
    public List<EmployeeCard> getAllByNameAndEmail(String email, String name) {
       EmployeeRepo employeeRepo=new EmployeeRepoImpl();
       List<EmployeeCard> list=employeeRepo.getAllByNameAndEmail(email,name);
       return list;
    }
}
