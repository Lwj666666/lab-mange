package com.example.springmvcexamples.example02.controller;

import com.example.springmvcexamples.VO.ResultVO;
import com.example.springmvcexamples.example02.entity.User;
import com.example.springmvcexamples.example02.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/example02/")
public class ExampleController02 {

    @Autowired
    public UserService userService;

    @GetMapping("exception")
    public void getExpetion(){
        userService.readFile();
    }

    @PostMapping("login")
    public ResultVO login(@RequestBody User user){
        if(!("BO".equals(user.getUserName())&&"123456".equals(user.getPassword()))){
            return ResultVO.error(401,"用户名密码错误");
        }
        return ResultVO.success(Map.of());
    }
}
