package com.springboot.crudoperation.dao;

import com.springboot.crudoperation.entity.Employee;
import com.springboot.crudoperation.model.EmployeeModel;
import com.springboot.crudoperation.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDAO {

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeModel persistEmpDataToDB(EmployeeModel employeeModel) throws Exception {
        Employee employee = new Employee();

        try {
            BeanUtils.copyProperties(employeeModel, employee);
            employeeRepository.save(employee);
            return employeeModel;
        } catch (Exception e) {
            throw new Exception("Error occurred while persisting data in the database");
        }
    }
}
