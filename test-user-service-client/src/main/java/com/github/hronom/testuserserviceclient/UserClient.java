package com.github.hronom.testuserserviceclient;

import com.github.hronom.testuserservicecommon.UserService;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("test-user-service")
public interface UserClient extends UserService {

}
