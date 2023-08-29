package com.example.library.dto;


import lombok.Data;

@Data
public class ClientDto {
    private int clientId;
    private String clientName;
    private String clientSurname;
    private String clientEmail;
    private Long clientPhoneNumber;
}
