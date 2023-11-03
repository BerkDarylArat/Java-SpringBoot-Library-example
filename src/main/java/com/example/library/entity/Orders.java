package com.example.library.entity;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int orderId;

    @Column(name = "order_date")
    private int orderDate;

    @Column(name = "order_expiration_date")
    private int orderExpirationDate;

    @ManyToOne
    @JoinColumn(name = "order_owner")
    private Client orderOwnerFk;

    @ManyToOne
    @JoinColumn(name = "order_taker")
    private Employees orderTakerFk;

    @ManyToOne
    @JoinColumn(name = "ordered_book")
    private Books orderedBook;
}
