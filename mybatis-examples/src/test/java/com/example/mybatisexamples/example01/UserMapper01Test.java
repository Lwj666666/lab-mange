package com.example.mybatisexamples.example01;

import com.example.mybatisexamples.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@Rollback(value = false)
@Slf4j
public class UserMapper01Test {
    @Autowired
    private UserMapper01 userMapper01;

    @Test
    public void test_adduser(){
        User user = new User();
        user.setId(2L);
        user.setName("SUN");
        user.setCompany("facebook");
        userMapper01.insert(user);
    }

    @Test
    public void test_list(){
        for (User user : userMapper01.list()) {
            log.debug("{}/{}/{}",
                    user.getName(),
                    user.getCompany(),
                    user.getCreateTime()
            );
        }
    }
}
