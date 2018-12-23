package com.github.hronom.testuserservicecommon;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value ="/users", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public interface UserService {
    @RequestMapping(method = RequestMethod.GET, value ="/{id}")
    User getUser(@PathVariable("id") String id);
}
