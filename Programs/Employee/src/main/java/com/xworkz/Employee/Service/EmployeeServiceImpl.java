package com.xworkz.Employee.Service;

import com.xworkz.Employee.Entity.EmployeeCard;

public class EmployeeServiceImpl  implements EmployeeService{
    @Override
    public boolean validAndSave(EmployeeCard es) {
        System.out.println(es);
        EmployeeRepo employeeRepo=new EmployeeRepoImpl();
        employeeRepo.save(es);
        return false;
    }
}
