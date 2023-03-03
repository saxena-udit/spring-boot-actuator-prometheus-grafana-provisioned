package com.sample.demo.controller;

import com.sample.demo.domain.User;
import com.sample.demo.utility.TrackTime;
import com.sample.demo.service.UserService;
import com.sample.demo.utility.Measurable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/user")
public class UserController implements Measurable {

    private UserService service;

    @Autowired
    public UserController(final UserService service){
        this.service=service;
    }

    @GetMapping
    @TrackTime
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }


    @GetMapping("/{name}")
    @TrackTime
    public List<User> getAllUsers(@PathVariable("name") String name) {
        return service.searchByName(name);
    }
}
