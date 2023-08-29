package com.example.library.service;

import com.example.library.baseservice.BaseService;
import com.example.library.dto.OrderDto;
import com.example.library.entity.Orders;

public interface OrderService extends BaseService<Orders,Integer> {
    Orders create(OrderDto orderDto);
    Orders update(OrderDto orderDto);
    void delete(OrderDto orderDto);

}