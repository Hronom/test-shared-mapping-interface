package com.github.hronom.testuserprocessingservice;

import com.github.hronom.testuserserviceclient.UserClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(clients = {UserClient.class})
public class TestUserProcessingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestUserProcessingServiceApplication.class, args);
    }
}

