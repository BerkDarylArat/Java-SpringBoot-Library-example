package com.example.library.controller;

import com.example.library.baserepository.BaseRepository;
import com.example.library.dto.BooksDto;
import com.example.library.entity.Books;
import com.example.library.repository.BooksRepository;
import com.example.library.service.BooksService;
import com.example.library.service.serviceimpl.BooksServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.library.exception.ResponsePayload;


import java.time.ZonedDateTime;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    @Autowired
    BooksService booksService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Books>> findAll(){
        return ResponseEntity.ok(booksService.findAll());
    }

    @PostMapping("/add")
    public ResponseEntity<Object> create(@RequestBody BooksDto booksDto) {
        Books books = booksService.create(booksDto);
        ResponsePayload responsePayload = new ResponsePayload(ZonedDateTime.now(), "Kayıt oluşturuldu.", books);
        return new ResponseEntity<>(responsePayload, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public Books update(@PathVariable("id") Integer id, @RequestBody BooksDto booksDto) {
        booksDto.setBookId(id);
        return booksService.update(booksDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") int id){
        booksService.delete(id);
    }

}
