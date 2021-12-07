package com.example.javainterview.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServiceTests {

    @Test
    public void createAccount() {
        Service service = new Service();

        assertEquals( 1, service.create("Name",15.20) );
    }
}
