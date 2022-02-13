package com.springboot.crudoperation.controller;

import com.springboot.crudoperation.model.EmployeeModel;
import com.springboot.crudoperation.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeServiceImpl;

    @PostMapping("/onboard-employee")
    public ResponseEntity<EmployeeModel> registerEmp(@RequestBody EmployeeModel newEmp) throws Exception {

        return new ResponseEntity<>(employeeServiceImpl.registerEmp(newEmp), HttpStatus.OK);
    }
}
