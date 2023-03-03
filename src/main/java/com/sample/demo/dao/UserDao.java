package com.sample.demo.dao;

import com.sample.demo.domain.User;
import com.sample.demo.utility.Measurable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "userdata")
public interface UserDao extends CrudRepository<User,Long>, Measurable {
    List<User> findByName(String name);
}
