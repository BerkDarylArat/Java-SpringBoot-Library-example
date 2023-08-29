package com.example.library.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Payload;
import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponsePayload implements Payload {
    private ZonedDateTime timestamp;
    private String message;
    private Object data;

//    public ResponsePayload(ZonedDateTime timestamp, String message) {
//        this.timestamp = timestamp;
//        this.message = message;
//    }
}