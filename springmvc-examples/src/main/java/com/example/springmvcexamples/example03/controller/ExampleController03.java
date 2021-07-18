package com.example.springmvcexamples.example03.controller;

import com.example.springmvcexamples.example03.entity.User03;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Size;

@RestController
@RequestMapping("/api/example03/")
@Slf4j
@Validated
public class ExampleController03 {

    @PostMapping("users")
    public void postUser(@Valid @RequestBody User03 user){
    }

    @GetMapping("users/{uid}/file")
    public void get(@PathVariable("uid") int uid){
    }
    @GetMapping("users/{owner}")
    public void getViolationException(
            @Size(min = 2, max = 6, message = "用户信息错误")
            @PathVariable String owner) {
    }
}
