package com.example.library.repository;

import com.example.library.baserepository.BaseRepository;
import com.example.library.entity.Client;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends BaseRepository<Client,Integer> {
}