package com.bridgelabz.employeepayrollapp.repository;

import com.bridgelabz.employeepayrollapp.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

//Employee Repo extending the JpaRepository to perform CRUD Operations
public interface EmployeeRepo extends JpaRepository<EmployeeEntity,Long> {

}