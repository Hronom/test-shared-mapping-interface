package com.github.hronom.testuserprocessingservice;

import com.github.hronom.testuserserviceclient.UserClient;
import com.github.hronom.testuserservicecommon.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersProcessingController {
    private final UserClient userClient;

    @Autowired
    public UsersProcessingController(UserClient userClient) {
        this.userClient = userClient;
    }

    @RequestMapping(method = RequestMethod.GET, value ="/test/{id}")
    public User getUser(@PathVariable("id") String id) {
        return userClient.getUser(id);
    }
}
