package com.example.demo.service;

import java.util.List;

import com.example.demo.model.*;

public interface UserService {
    int insertUser(User user);
    int deleteUser(Integer id);
    User selectUser(Integer id);
    int updateUser(User user);
    List<User> findAll();

    MyResult login(User user);
    User showUser(User user);
}