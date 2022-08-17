package com.bridgelabz.employeepayrollapplicationdemo.service;

import com.bridgelabz.employeepayrollapplicationdemo.entity.EmployeeEntity;
import com.bridgelabz.employeepayrollapplicationdemo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService{

    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public EmployeeEntity addEmployee(EmployeeEntity employeeEntity) {

        //Save data to DB usig Employee Repo Interface
        return employeeRepo.save(employeeEntity);
    }
}