package com.example.library.service;

import com.example.library.baseservice.BaseService;
import com.example.library.dto.EmployeesDto;
import com.example.library.entity.Employees;

public interface EmployeesService extends BaseService<Employees,Integer> {
    Employees create(EmployeesDto employeesDto);
    Employees update(EmployeesDto employeesDto);
    void delete(EmployeesDto employeesDto);

}