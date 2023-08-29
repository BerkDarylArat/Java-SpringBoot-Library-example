package com.example.library.controller;

import com.example.library.dto.OrderDto;
import com.example.library.entity.Orders;
import com.example.library.exception.ResponsePayload;
import com.example.library.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Orders>> findAll(){
        return ResponseEntity.ok(orderService.findAll());
    }

    @PostMapping("/add")
    public ResponseEntity<Object> create(@RequestBody OrderDto orderDto) {
        Orders orders = orderService.create(orderDto);
        ResponsePayload responsePayload = new ResponsePayload(ZonedDateTime.now(), "Kayıt oluşturuldu.", orders);
        return new ResponseEntity<>(responsePayload, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public Orders update(@PathVariable("id") Integer id, @RequestBody OrderDto orderDto) {
        orderDto.setOrderId(id);
        return orderService.update(orderDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") int id){
        orderService.delete(id);
    }
}
