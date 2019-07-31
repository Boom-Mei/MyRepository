package com.example.demo.mapper;

import java.util.List;

import com.example.demo.model.*;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insertUser(User user);
    int deleteUser(Integer id);
    User selectUser(Integer id);
    int updateUser(User user);
    List<User> selectAll();

    List<User> login(User user);
    User showUser(User user);
}