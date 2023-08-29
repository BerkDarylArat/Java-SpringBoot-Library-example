package com.example.library.repository;

import com.example.library.baserepository.BaseRepository;
import com.example.library.entity.Employees;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepository extends BaseRepository<Employees,Integer> {
}