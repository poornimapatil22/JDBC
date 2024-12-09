package com.xworkz.Employee.Runner;

import com.xworkz.Employee.Entity.EmployeeCard;
import com.xworkz.Employee.Service.EmployeeService;
import com.xworkz.Employee.Service.EmployeeServiceImpl;

import java.time.LocalDate;

public class EmployeeAnotherRunner {
    public static void main(String[] args) {


        EmployeeCard em = new EmployeeCard("Poorna", "poornimapatil@gmail.com", 9098765432L, true, 'C', (short) 7, (byte) 3, 6.0f, 41.0, LocalDate.of(2024, 12, 25));
        EmployeeService employeeService = new EmployeeServiceImpl();
        System.out.println(em);
        boolean makeSave = employeeService.validAndSave(em);
    }
}