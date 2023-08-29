package com.example.library.dto;

import lombok.Data;

@Data
public class OrderDto {
    private int orderId;
    private int orderDate;
    private int orderExpirationDate;
    private int orderOwnerFk;
    private int orderTakerFk;
    private int orderedBook;
}
