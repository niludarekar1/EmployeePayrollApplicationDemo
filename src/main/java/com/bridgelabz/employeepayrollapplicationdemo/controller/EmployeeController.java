package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.entity.EmployeeEntity;
import com.bridgelabz.employeepayrollapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    //Autowired Employee Service
    @Autowired
    EmployeeService employeeService;

    //URL - http://localhost:8080/emphome
    @GetMapping("/emphome")
    public String openHome1() {
        return "index";
    }

    @RequestMapping(value = "/emppayroll")
    public String openHome2() {
        return "emppayroll";
    }

    //POST Mapping for Employee Payroll Data to be stored in DB by Employee Service
    @RequestMapping(value = "/saveemp", method = RequestMethod.POST)
    public @ResponseBody EmployeeEntity test(EmployeeEntity employeeEntity) {
        return employeeService.addEmployee(employeeEntity);
    }
}