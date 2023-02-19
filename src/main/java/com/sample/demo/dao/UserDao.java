package com.sample.demo.dao;

import com.sample.demo.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "user")
public interface UserDao extends CrudRepository<User,Long> {
    List<User> findByName(String name);
}
