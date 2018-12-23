package com.github.hronom.testuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TestUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestUserServiceApplication.class, args);
    }
}

