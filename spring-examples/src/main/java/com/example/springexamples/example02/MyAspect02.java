package com.example.springexamples.example02;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
@Slf4j
public class MyAspect02 {
    @Pointcut("execution(* com.example.springexamples.example02.AOPService02.*(..))")
    public void pointcut(){}

    @Before("pointcut()")
    public void before(JoinPoint joinPoint){
        log.debug("before()");
    }
    @After("pointcut()")
    public void after(){
        log.debug("after()");
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] objects = joinPoint.getArgs();
        if(objects[0].equals("BO")){
            objects[0]="SUN";
        }
        Object object = joinPoint.proceed(objects);
        log.debug("返回的类型为：{}",object.getClass());
        return object;
    }
}
