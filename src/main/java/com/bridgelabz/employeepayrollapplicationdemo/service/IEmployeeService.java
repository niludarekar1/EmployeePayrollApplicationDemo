package com.bridgelabz.employeepayrollapplicationdemo.service;

import com.bridgelabz.employeepayrollapplicationdemo.entity.EmployeeEntity;
import org.springframework.web.servlet.ModelAndView;


public interface IEmployeeService {
    EmployeeEntity addEmployee(EmployeeEntity employeeEntity);

    void addEmployee2(EmployeeEntity employeeEntity);

    ModelAndView getAllEmp();
}