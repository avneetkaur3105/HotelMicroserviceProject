package com.app.service.hotel.exceptions;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Map<String,Object>> handleNoResourceException(ResourceNotFoundException ex){
        Map<String,Object> mp=new HashMap<>();
        mp.put("message",ex.getMessage());
        mp.put("success",true);
        mp.put("status", HttpStatus.NOT_FOUND);

        return ResponseEntity.ok(mp);
    }
}
