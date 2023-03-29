package com.h2ByIps.h2ByIps.controller;

import com.h2ByIps.h2ByIps.Entity.Employee;
import com.h2ByIps.h2ByIps.Repositry.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class empController {
    @Autowired
    EmpRepo empRepo ;
    @PostMapping("/employees")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        Employee saveEmp = empRepo.save(employee) ;
        return new ResponseEntity<>(saveEmp , HttpStatus.OK) ;
    }

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getEmployee(){
        List<Employee> emp = new ArrayList<>() ;
       emp = empRepo.findAll() ;
       return new ResponseEntity<>(emp , HttpStatus.OK) ;
    }


}
