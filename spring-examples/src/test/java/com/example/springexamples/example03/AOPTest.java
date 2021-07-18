package com.example.springexamples.example03;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class AOPTest {
    @Autowired
    public AOPService03 service03;

    @Test
    public void test_03(){
        service03.get();
    }
}
