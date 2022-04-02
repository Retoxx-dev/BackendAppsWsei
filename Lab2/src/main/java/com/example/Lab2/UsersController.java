package com.example.Lab2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@Controller
public class UsersController {
    private Map<Long, UserEntity> users = new HashMap<Long, UserEntity>();

    @GetMapping("/users")
    @ResponseBody
    public Map<Long, UserEntity> user(){
        return users;
    }

    @GetMapping("/users/{id}/get")
    @ResponseBody
    public UserEntity user(@PathVariable Long id){
        return users.get(id);
    }

    @GetMapping("/users/add")
    @ResponseBody
    public UserEntity user(@RequestParam String name, @RequestParam int age){
        Long id = new Long(users.size()+1);
        UserEntity user = new UserEntity(id, name, age);
        users.put(id, user);
        return user;
    }

    @GetMapping("/users/{id}/remove")
    @ResponseBody
    public String remove(@PathVariable Long id){
        users.remove(id);
        return "User with id " + id + " has been deleted";
    }
}
