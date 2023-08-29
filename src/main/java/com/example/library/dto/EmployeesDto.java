package com.example.library.dto;

import lombok.Data;

import java.util.Date;

@Data
public class EmployeesDto {
    private int employeeId;
    private String employeeName;
    private String employeeSurname;
    private int employeeStartDate;
    private String clientEmail;
    private Long clientPhoneNumber;
}
