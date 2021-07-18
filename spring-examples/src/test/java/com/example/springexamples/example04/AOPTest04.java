package com.example.springexamples.example04;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class AOPTest04 {
    @Autowired
    public UserService04 service04;

    @Test
    public void test_around(){
        service04.admin();
        service04.user();
    }
}
