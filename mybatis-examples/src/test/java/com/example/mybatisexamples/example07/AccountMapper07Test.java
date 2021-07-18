package com.example.mybatisexamples.example07;

import com.example.mybatisexamples.entity.Account;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Slf4j
@SpringBootTest
public class AccountMapper07Test {
    @Autowired
    private Account07 account07;

    @Test
    public void acc_test() throws InterruptedException{
        ExecutorService service = Executors.newCachedThreadPool();

        int count = 2;

        CountDownLatch latch = new CountDownLatch(count);

        for(int i=0;i<count;i++){
            service.execute(()->{
                try {
                    Thread.sleep(1000);
                    Account a = account07.buy(1,600);
                    log.debug(a.getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    latch.countDown();
                }
            });
        }
        latch.await();
        service.shutdown();
    }
}
