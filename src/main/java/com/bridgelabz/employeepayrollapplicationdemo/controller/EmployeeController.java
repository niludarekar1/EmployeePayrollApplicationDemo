package com.bridgelabz.employeepayrollapplicationdemo.controller;


import com.bridgelabz.employeepayrollapplicationdemo.entity.EmployeeEntity;
import com.bridgelabz.employeepayrollapplicationdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    //Autowired Employee Service
    @Autowired
    EmployeeService employeeService;

    //URL Request Mapping for Employee Home View Page i.e. index.html
    //URL - http://localhost:8080/emphome
    @RequestMapping("/emphome")
    public String openHome1() {
        return "index";
    }

    //URL Request Mapping for Employee Payroll Page i.e. emppayroll.html
    //URL - http://localhost:8080/emppayroll
    @RequestMapping(value="/emppayroll")
    public String openHome2() {
        return "emppayroll";
    }

    //POST Mapping for Employee Payroll Data to be stored in DB by Employee Service
    @RequestMapping(value="/saveemp", method= RequestMethod.POST)
    public @ResponseBody EmployeeEntity test(EmployeeEntity employeeEntity){
        return employeeService.addEmployee(employeeEntity);
    }

}