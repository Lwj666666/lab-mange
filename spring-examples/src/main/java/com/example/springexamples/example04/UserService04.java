package com.example.springexamples.example04;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@MyAuthority
@Service
@Slf4j
public class UserService04 {
    @MyAuthority(value = MyAuthority.MyAuthorityType.ADMIN)
    public void admin(){
        log.debug("管理员权限");
    }

    public void user(){
        log.debug("用户权限");
    }
}
