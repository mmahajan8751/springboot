package com.springboot.crudoperation.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Employee {

    @Id
    private String employeeId;

    @Column
    private String employeeName;

    @Column
    private String employeeAddress;

    @Column
    private String employeeEmail;
}
