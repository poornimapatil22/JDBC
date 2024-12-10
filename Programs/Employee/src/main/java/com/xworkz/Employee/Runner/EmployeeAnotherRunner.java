package com.xworkz.Employee.Runner;

import com.xworkz.Employee.Entity.EmployeeCard;
import com.xworkz.Employee.Service.EmployeeService;
import com.xworkz.Employee.Service.EmployeeServiceImpl;

import java.time.LocalDate;
import java.util.List;

public class EmployeeAnotherRunner {
    public static void main(String[] args) {


        EmployeeCard em = new EmployeeCard("Sushmitaa", "Sushmitapatil@gmail.com", 9098765432L, true, 'C', (short) 7, (byte) 3, 6.0f, 41.0, LocalDate.of(2024, 12, 25));
        EmployeeService employeeService = new EmployeeServiceImpl();
        System.out.println(em);
        employeeService.validAndSave(em);

        List<EmployeeCard> list= employeeService.findAll();
        System.out.println("list:"+list);

        System.out.println("===================");

        List<Object[]> list1= employeeService.getById(5);
        System.out.println("nameAndemail:"+list1);

        System.out.println("=====================");

        List<EmployeeCard> list2=employeeService.getAllByNameAndEmail("kiran@gmail.com","Kiran");
        System.out.println("All the details by name and email: "+list2);
    }
}