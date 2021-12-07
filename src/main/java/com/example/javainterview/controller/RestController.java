package com.example.javainterview.controller;

import com.example.javainterview.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {


    private Service service;

    public RestController(Service service) {
        this.service = service;
    }
    @GetMapping("/test")
    public String test() {
        return "Hello";
    }

    @PostMapping("/accounts")
    public ResponseEntity<Object> create() {
        return service.create();
    }

    @GetMapping("/accounts/{id}")
    public ResponseEntity<Object> getAccount() {
        return service.getAccount();
    }
}
