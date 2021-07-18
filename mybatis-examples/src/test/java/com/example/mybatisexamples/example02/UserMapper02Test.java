package com.example.mybatisexamples.example02;

import com.example.mybatisexamples.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Transactional
@Rollback(value = false)
@Slf4j
public class UserMapper02Test {
    @Autowired
    private UserMapper02 userMapper02;

    @Test
    public void adduser_tset(){
        User user = new User();
        user.setName("SUN");
        user.setCompany("amazon");
        userMapper02.insert(user);
    }

    @Test
    public void update_test(){
        User user = User.builder()
                .id(1L)
                .company("nike")
                .build();
        userMapper02.updateById(user);
    }

    @Test
    public void list_test(){
        List<User> users = userMapper02.listByCompany("facebook");
        for (User user : users) {
            log.debug(user.getName());
        }
    }
}
