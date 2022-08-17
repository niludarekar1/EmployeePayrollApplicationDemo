package com.bridgelabz.employeepayrollapplicationdemo.repository;

import com.bridgelabz.employeepayrollapplicationdemo.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

//Employee Repo extending the JpaRepository to perform CRUD Operations
public interface EmployeeRepo extends JpaRepository<EmployeeEntity,Long> {

}