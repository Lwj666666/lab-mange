package com.example.springmvcexamples.example05;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

@Slf4j
@SpringBootTest
public class EncryptorTest {
    @Autowired
    public EncryptComponent05 encrypt;

    @Test
    public void test_encrypt(){
        Map<String,Object> map = Map.of("uid",12345678,"role",9);
        String re = encrypt.encrypt(map);
        log.debug(re);
        log.debug("{}",re.length());
    }

    @Test
    public void test_decrypt(){
        Map<String,Object> token = encrypt.decrypt("a8b8d75da93bd05fba7756dc5e3781dc9b75f1e3a5ece764d9e9d8248d2700c2245b2f791ffc622a6fd3e7c0b7f84e17");
        log.debug("{}",token.get("uid"));
        log.debug("{}",token.get("role"));
//        token.forEach(
//                (k,v)->{
//                    log.debug(v.toString());
//                }
//        );
    }
}
