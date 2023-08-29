package com.example.library.service.serviceimpl;

import com.example.library.baseservice.baseserviceimpl.BaseServiceImpl;
import com.example.library.dto.EmployeesDto;
import com.example.library.entity.Employees;
import com.example.library.repository.EmployeesRepository;
import com.example.library.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class EmployeesServiceImpl extends BaseServiceImpl<Employees,Integer> implements EmployeesService {
    @Autowired
    EmployeesRepository employeesRepository;
    @Override
    public Employees create(EmployeesDto employeesDto) {
        Employees employees = new Employees();
        employees.setEmployeeName(employeesDto.getEmployeeName());
        employees.setEmployeeSurname(employeesDto.getEmployeeSurname());
        employees.setEmployeeStartDate(employeesDto.getEmployeeStartDate());
        employeesRepository.save(employees);
        return employees;
    }

    @Override
    public Employees update(EmployeesDto employeesDto) {
        Employees employees = employeesRepository.findById(employeesDto.getEmployeeId()).orElseThrow(EntityNotFoundException::new);
        employees.setEmployeeName(employeesDto.getEmployeeName());
        employees.setEmployeeSurname(employeesDto.getEmployeeSurname());
        employees.setEmployeeStartDate(employeesDto.getEmployeeStartDate());
        employeesRepository.save(employees);
        return employees;
    }

    @Override
    public void delete(EmployeesDto employeesDto) {
        Employees employees = employeesRepository.findById(employeesDto.getEmployeeId()).orElseThrow(EntityNotFoundException::new);
        employeesRepository.delete(employees);
    }
}
