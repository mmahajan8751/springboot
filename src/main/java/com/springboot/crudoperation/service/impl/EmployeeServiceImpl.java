package com.springboot.crudoperation.service.impl;

import com.springboot.crudoperation.dao.EmployeeDAO;
import com.springboot.crudoperation.model.EmployeeModel;
import com.springboot.crudoperation.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public EmployeeModel registerEmp(EmployeeModel employeeModel) throws Exception {
        return employeeDAO.persistEmpDataToDB(employeeModel);
    }
}
