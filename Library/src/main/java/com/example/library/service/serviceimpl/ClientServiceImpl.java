package com.example.library.service.serviceimpl;

import com.example.library.baseservice.baseserviceimpl.BaseServiceImpl;
import com.example.library.dto.ClientDto;
import com.example.library.entity.Client;
import com.example.library.repository.ClientRepository;
import com.example.library.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class ClientServiceImpl extends BaseServiceImpl<Client,Integer> implements ClientService {
    @Autowired
    ClientRepository clientRepository;
    @Override
    public Client create(ClientDto clientDto) {
        Client client = new Client();
        client.setClientName(clientDto.getClientName());
        client.setClientSurname(clientDto.getClientSurname());
        client.setClientEmail(clientDto.getClientEmail());
        client.setClientPhoneNumber(clientDto.getClientPhoneNumber());
        clientRepository.save(client);
        return client;
    }

    @Override
    public Client update(ClientDto clientDto) {
        Client client = clientRepository.findById(clientDto.getClientId()).orElseThrow(EntityNotFoundException::new);
        client.setClientName(clientDto.getClientName());
        client.setClientSurname(clientDto.getClientSurname());
        client.setClientEmail(clientDto.getClientEmail());
        client.setClientPhoneNumber(clientDto.getClientPhoneNumber());
        clientRepository.save(client);
        return client;
    }

    @Override
    public void delete(ClientDto clientDto) {
        Client client = clientRepository.findById(clientDto.getClientId()).orElseThrow(EntityNotFoundException::new);
        clientRepository.delete(client);
    }
}
