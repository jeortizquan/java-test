package com.example.javainterview.config;

import com.example.javainterview.service.Service;
import org.springframework.context.annotation.Bean;

public class ServiceConfiguration {

    @Bean
    public Service service() {
        return new Service();
    }
}
