package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.*;
import com.example.demo.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper; //这里会报错，但并不影响

    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public int deleteUser(Integer id) {
        return userMapper.deleteUser(id);
    }

    @Override
    public User selectUser(Integer id) {
        return userMapper.selectUser(id);
    }

    @Override
    public List<User> findAll() {
        return userMapper.selectAll();
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public MyResult login(User user){
        //User u = new User();
        List<User> list = new ArrayList<User>();
        list = userMapper.login(user);
        MyResult result = new MyResult();
        if(list.size()!=0) {
            result.setCode(0);
            result.setMsg("登陆成功！");
            result.setList(list);
            result.setObj(list.get(0));
        }else{
            result.setCode(1);
            result.setMsg("登陆失败！");
        }
        return result;
    }

    @Override
    public User showUser(User user){
        return userMapper.showUser(user);
    }
}