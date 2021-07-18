package com.example.mybatisexamples.example05;

import com.example.mybatisexamples.entity.Address;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class UserMapper05Test {
    @Autowired
    private UserMapper05 userMapper05;

    @Test
    public void getUser_test4() {
        UserDTO05 userDTO = userMapper05.getByXML2(2L);
        log.debug("{}/{}",userDTO.getName(),userDTO.getCompany());
        for (Address a : userDTO.getAddresses()) {
            log.debug("{}/{}",a.getDetail() ,a.getCreateTime());
        }
    }
}
