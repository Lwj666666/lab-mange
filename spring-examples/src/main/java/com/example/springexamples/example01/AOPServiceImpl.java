package com.example.springexamples.example01;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AOPServiceImpl implements AOPService{
    @Override
    public void get() {
        log.debug("AOPServiceImpl");
    }
}
