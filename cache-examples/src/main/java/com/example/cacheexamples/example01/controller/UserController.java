package com.example.cacheexamples.example01.controller;

import com.example.cacheexamples.example01.service.UserService;
import com.example.cacheexamples.example01.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class UserController {
    @Autowired
    public UserService userService;

    @GetMapping("user/{uid}")
    public User getUser(@PathVariable int uid){
        return userService.getUser(uid);
    }
    @PatchMapping("users")
    public User patchUser(@RequestBody User user){
        return userService.updateUser(user);
    }
    @DeleteMapping("users/{uid}")
    public void delUser(@PathVariable int uid){
        userService.delUser(uid);
    }
}
