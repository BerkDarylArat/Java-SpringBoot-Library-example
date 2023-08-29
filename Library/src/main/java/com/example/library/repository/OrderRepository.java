package com.example.library.repository;

import com.example.library.baserepository.BaseRepository;
import com.example.library.entity.Orders;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends BaseRepository<Orders,Integer> {
}