package com.example.library.controller;

import com.example.library.dto.ClientDto;
import com.example.library.entity.Client;
import com.example.library.exception.ResponsePayload;
import com.example.library.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;
import java.util.List;


@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Client>> findAll(){
        return ResponseEntity.ok(clientService.findAll());
    }

    @PostMapping("/add")
    public ResponseEntity<Object> create(@RequestBody ClientDto clientDto) {
        Client client = clientService.create(clientDto);
        ResponsePayload responsePayload = new ResponsePayload(ZonedDateTime.now(), "Kayıt oluşturuldu.", client);
        return new ResponseEntity<>(responsePayload, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public Client update(@PathVariable("id") Integer id, @RequestBody ClientDto clientDto) {
        clientDto.setClientId(id);
        return clientService.update(clientDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") int id){
        clientService.delete(id);
    }
}
