package com.example.mybatisexamples.example04;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Rollback(value = false)
@Transactional
@SpringBootTest
public class AddressMapperTest {
    @Autowired
    private AddressMapper04 addressMapper04;

    @Test
    public void test_list(){
        List<AddressDTO04> addressDTO04s = addressMapper04.list("1201");
        for (AddressDTO04 a : addressDTO04s) {
            log.debug("{}/{}/{}",
                    a.getName(),
                    a.getCompany(),
                    a.getId());
        }

    }
}
