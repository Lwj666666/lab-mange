package com.example.springmvcexamples.example04.controller;

import com.example.springmvcexamples.VO.ResultVO;
import com.example.springmvcexamples.example04.service.UserService04;
import com.example.springmvcexamples.example04.user.User04;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api/example04/")
public class examplecontroller04 {
    @Autowired
    public PasswordEncoder passwordEncoder;

    @Autowired
    public UserService04 userService04;

    @PostMapping("login")
    public ResultVO get(@RequestBody User04 user){

        User04 u = userService04.getUser(user.getUserName());

        if(u==null||!passwordEncoder.matches(user.getPassword(), u.getPassword())){

            log.debug("登录失败");
            return ResultVO.error(400,"用户名密码错误");
        }

        log.debug("登录成功");
        return ResultVO.success(Map.of("user",u));
    }
}
