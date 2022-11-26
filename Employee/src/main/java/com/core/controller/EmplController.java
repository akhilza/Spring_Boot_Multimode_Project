package com.core.controller;

import com.core.entity.Employee;
import com.core.services.EmployeeServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmplController {

    private EmployeeServices employeeServices;

    public EmplController(EmployeeServices employeeServices) {
        this.employeeServices = employeeServices;
    }

    @PostMapping("/save")
    public ResponseEntity<String> employeeSave(@RequestBody Employee employee){
        String saveEmpl = employeeServices.emplCreate(employee);
        return new ResponseEntity<>(saveEmpl, HttpStatus.OK);
    }
}
