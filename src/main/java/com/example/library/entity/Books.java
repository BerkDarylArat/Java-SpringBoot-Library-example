package com.example.library.entity;


import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "book")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookId;

    @Column(name = "book_name")
    private String bookName;

    @Column(name = "book_author")
    private String bookAuthor;

    @Column(name = "book_publish_year")
    private int bookPublishYear;

    @Column(name = "book_type")
    private String bookType;
}
