package com.example.library.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "employee")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeId;

    @Column(name = "employee_name")
    private String employeeName;

    @Column(name = "employee_surname")
    private String employeeSurname;

    @Column(name = "employee_start_date")
    private int employeeStartDate;

    @Column(name = "employee_email")
    private String clientEmail;

    @Column(name = "employee_phone_number")
    private Long clientPhoneNumber;
}
