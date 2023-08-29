package com.example.library.service;

import com.example.library.baseservice.BaseService;
import com.example.library.dto.ClientDto;
import com.example.library.entity.Client;

public interface ClientService extends BaseService<Client,Integer> {
    Client create(ClientDto clientDto);
    Client update(ClientDto clientDto);
    void delete(ClientDto clientDto);

}