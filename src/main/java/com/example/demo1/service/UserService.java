package com.example.demo1.service;




import com.example.demo1.model.User;
import com.example.demo1.model.UserDto;

import java.util.List;

public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    void delete(long id);
    User findOne(String username);

    User findById(Long id);
}