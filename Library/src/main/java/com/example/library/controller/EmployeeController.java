package com.example.library.controller;

import com.example.library.dto.EmployeesDto;
import com.example.library.entity.Employees;
import com.example.library.exception.ResponsePayload;
import com.example.library.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeesService employeesService;


    @GetMapping("/getAll")
    public ResponseEntity<List<Employees>> findAll(){
        return ResponseEntity.ok(employeesService.findAll());
    }

    @PostMapping("/add")
    public ResponseEntity<Object> create(@RequestBody EmployeesDto employeesDto) {
        Employees employees = employeesService.create(employeesDto);
        ResponsePayload responsePayload = new ResponsePayload(ZonedDateTime.now(), "Kayıt oluşturuldu.", employees);
        return new ResponseEntity<>(responsePayload, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public Employees update(@PathVariable("id") Integer id, @RequestBody EmployeesDto employeesDto) {
        employeesDto.setEmployeeId(id);
        return employeesService.update(employeesDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") int id){
        employeesService.delete(id);
    }
}
