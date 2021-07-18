package com.example.springexamples.example03;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class MyAspect03 {
    @Pointcut("execution(* com.example.springexamples.example03.AOPService03.get())")
    public void pointcut(){}

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        long t1 = System.nanoTime();
        Object object = joinPoint.proceed();
        long t2 = System.nanoTime();
        log.debug("运行的时间是：{}",t2-t1);

        return  object;
    }
}
