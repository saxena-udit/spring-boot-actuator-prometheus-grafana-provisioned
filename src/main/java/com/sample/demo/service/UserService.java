package com.sample.demo.service;

import com.sample.demo.dao.UserDao;
import com.sample.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class UserService {
    private UserDao dao;

    @Autowired
    public UserService(final UserDao dao) {
        this.dao = dao;
    }

    public List<User> getAllUsers() {
        return StreamSupport.stream(dao.findAll().spliterator(), false).collect(Collectors.toList());
    }

    public List<User> searchByName(String name) {
        return dao.findByName(name).stream().collect(Collectors.toList());
    }

}
