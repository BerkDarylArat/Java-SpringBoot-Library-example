package com.example.library.service.serviceimpl;

import com.example.library.baseservice.baseserviceimpl.BaseServiceImpl;
import com.example.library.dto.BooksDto;
import com.example.library.entity.Books;
import com.example.library.repository.BooksRepository;
import com.example.library.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class BooksServiceImpl extends BaseServiceImpl<Books,Integer> implements BooksService {

    @Autowired
    BooksRepository booksRepository;

    @Override
    public Books create(BooksDto booksDto) {
        Books books = new Books();
        books.setBookName(booksDto.getBookName());
        books.setBookAuthor(booksDto.getBookAuthor());
        books.setBookType(booksDto.getBookType());
        books.setBookPublishYear(booksDto.getBookPublishYear());
        booksRepository.save(books);
        return books;
    }

    @Override
    public Books update(BooksDto booksDto) {
        Books books = booksRepository.findById(booksDto.getBookId()).orElseThrow(EntityNotFoundException::new);
        books.setBookName(booksDto.getBookName());
        books.setBookAuthor(booksDto.getBookAuthor());
        books.setBookType(booksDto.getBookType());
        books.setBookPublishYear(booksDto.getBookPublishYear());
        booksRepository.save(books);
        return books;
    }

    @Override
    public void delete(BooksDto booksDto) {
        Books books = booksRepository.findById(booksDto.getBookId()).orElseThrow(EntityNotFoundException::new);
        booksRepository.delete(books);
    }
}
