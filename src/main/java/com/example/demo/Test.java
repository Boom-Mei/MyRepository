package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.service.UserServiceImpl;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {
    @Autowired
    private UserServiceImpl us;

    @org.junit.Test
    public void  addUser(){
        User u = new User(4,"shi",27);
        int a = us.insertUser(u);
        System.out.println(a);
    }

    @org.junit.Test
    public void deleteUser(){
        Integer id = 1;
        us.deleteUser(id);
    }

    @org.junit.Test
    public void selectUser(){
        Integer id = 1;
        User ur = us.selectUser(id);
        System.out.println(ur);
    }

    @org.junit.Test
    public void findAll(){
        List<User> u_list = us.findAll();
        System.out.println(u_list);
    }

    @org.junit.Test
    public void updateUser(){
        User u = new User(1,"AAAA",25);
        us.updateUser(u);
    }
}