package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.example.demo.model.*;
import com.example.demo.service.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }

    @RequestMapping(value = "/add")
    public int addUser(){
        User u = new User(3,"oooo",45);
        int stat = userService.insertUser(u);
        return stat;
    }

    @RequestMapping(value = "/delete")
    public int deleteUser(){
        return userService.deleteUser(1);
    }

    @RequestMapping(value = "/update")
    public int updateUser(){
        User u = new User(1,"Nike",20);
        return userService.updateUser(u);
    }

    @RequestMapping(value = "/select")
    public User selectUser(){
        return userService.selectUser(1);
    }

    //@ResponseBody
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @CrossOrigin
    public MyResult login(@RequestBody User user){
        return userService.login(user);
    }

    @PostMapping(value = "/show")
    @CrossOrigin
    public User showUser(@RequestBody User user){
        return userService.showUser(user);
    }
}