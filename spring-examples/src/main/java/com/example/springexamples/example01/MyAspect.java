package com.example.springexamples.example01;

import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class MyAspect {
    @Pointcut("execution(* com.example.springexamples.example01.AOPServiceImpl.*(..))")
    public void pointcut(){}

    @Before("pointcut()")
    public void beforeAdvice() {
        log.debug("beforeAdvice()");
    }
    @After("pointcut()")
    public void afterAdvice() {
        log.debug("afterAdvice()");
    }
    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        log.debug("before aroundAdvice");
        Object object = joinPoint.proceed();
        log.debug("after aroundAdvice");
        return object;
    }
}
