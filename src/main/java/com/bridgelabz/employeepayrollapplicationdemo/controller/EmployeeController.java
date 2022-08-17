package com.bridgelabz.employeepayrollapplicationdemo.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @GetMapping("/emphome")
    public String openHome1() {
        return "index";
    }

    @GetMapping("/emppayroll")
    public String openHome2() {
        return "emppayroll";
    }

}