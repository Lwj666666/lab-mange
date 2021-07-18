package com.example.springexamples.example04;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
public @interface MyAuthority {

    MyAuthorityType[] value() default MyAuthorityType.USER;
    public enum MyAuthorityType{
        USER,ADMIN
    }
}
