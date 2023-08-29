package com.example.library.repository;

import com.example.library.baserepository.BaseRepository;
import com.example.library.entity.Books;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends BaseRepository<Books,Integer> {
}