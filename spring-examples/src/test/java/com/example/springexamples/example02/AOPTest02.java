package com.example.springexamples.example02;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class AOPTest02 {
    @Autowired
    public AOPService02 aopService02;

    @Test
    public void test_aop2(){
        log.debug(aopService02.welcome("BO","book"));
    }
}
