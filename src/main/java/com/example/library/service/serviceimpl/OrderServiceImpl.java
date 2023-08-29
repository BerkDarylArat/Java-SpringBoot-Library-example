package com.example.library.service.serviceimpl;

import com.example.library.baseservice.baseserviceimpl.BaseServiceImpl;
import com.example.library.dto.OrderDto;
import com.example.library.entity.Orders;
import com.example.library.repository.BooksRepository;
import com.example.library.repository.ClientRepository;
import com.example.library.repository.EmployeesRepository;
import com.example.library.repository.OrderRepository;
import com.example.library.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class OrderServiceImpl extends BaseServiceImpl<Orders,Integer> implements OrderService {
    @Autowired
    BooksRepository booksRepository;
    @Autowired
    ClientRepository clientRepository;
    @Autowired
    EmployeesRepository employeesRepository;
    @Autowired
    OrderRepository orderRepository;

    @Override
    public Orders create(OrderDto orderDto) {
        Orders orders = new Orders();
        orders.setOrderDate(orderDto.getOrderDate());
        orders.setOrderExpirationDate(orderDto.getOrderExpirationDate());
        orders.setOrderedBook(booksRepository.findById(orderDto.getOrderedBook()).orElseThrow(EntityNotFoundException::new));
        orders.setOrderOwnerFk(clientRepository.findById(orderDto.getOrderOwnerFk()).orElseThrow(EntityNotFoundException::new));
        orders.setOrderTakerFk(employeesRepository.findById(orderDto.getOrderTakerFk()).orElseThrow(EntityNotFoundException::new));
        orderRepository.save(orders);
        return orders;
    }

    @Override
    public Orders update(OrderDto orderDto) {
        return null;
    }

    @Override
    public void delete(OrderDto orderDto) {

    }
}
