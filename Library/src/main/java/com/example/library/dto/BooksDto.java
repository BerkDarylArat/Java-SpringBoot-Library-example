package com.example.library.dto;

import lombok.Data;


@Data
public class BooksDto {
    private int bookId;
    private String bookName;
    private String bookAuthor;
    private int bookPublishYear;
    private String bookType;
}
