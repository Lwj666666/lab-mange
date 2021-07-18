package com.example.springexamples.example02;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AOPService02 {
    public String welcome(String name,String work){
        return "welcome"+name+work;
    }
}
