package com.example.springexamples.example01;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class AOPTest01 {
    @Autowired
    public AOPServiceImpl service;

    @Test
    public void test_aspect(){
        service.get();
    }
}
