package com.github.hronom.testuserservice;

import com.github.hronom.testuserservicecommon.UserService;
import com.github.hronom.testuserservicecommon.User;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController implements UserService {

    @Override
    public User getUser(String id) {
        User user = new User();
        user.id = id;
        user.name = "Name" + id;
        return user;
    }
}
