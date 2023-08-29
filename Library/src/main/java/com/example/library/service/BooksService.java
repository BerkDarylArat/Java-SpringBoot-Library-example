package com.example.library.service;

import com.example.library.baseservice.BaseService;
import com.example.library.dto.BooksDto;
import com.example.library.entity.Books;

public interface BooksService extends BaseService<Books,Integer> {
    Books create(BooksDto booksDto);
    Books update(BooksDto booksDto);
    void delete(BooksDto booksDto);

}
