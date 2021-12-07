package com.example.javainterview.controller;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.http.RequestEntity.post;

public class RestControllerTests {

    private MockMvc mock;

    @Test
    public void createAccount() {
        this.mock.perform(post("http://localhost:8080/api/accounts"))
                .andExpect()
                .andExpect(201)
                .andExpect(idaccount)
    /*
       { "name"  : "firstName",
         "saldo" : 5500.00
        }
     */
    }
}
