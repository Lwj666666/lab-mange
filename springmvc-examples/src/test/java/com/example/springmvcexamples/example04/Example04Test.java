package com.example.springmvcexamples.example04;

import com.example.springmvcexamples.example04.user.User04;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@Slf4j
@SpringBootTest
public class Example04Test {
    @Autowired
    public PasswordEncoder encoder;

    @Test
    public void test_password(){
        User04 u = new User04("BO","123456");
        String re = encoder.encode(u.password);
        log.debug(re);
        log.debug(encoder.encode(u.password));
        log.debug("{}",encoder.matches("123456",re));
    }
}
