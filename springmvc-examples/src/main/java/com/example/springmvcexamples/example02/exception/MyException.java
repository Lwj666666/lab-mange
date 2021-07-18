package com.example.springmvcexamples.example02.exception;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MyException extends RuntimeException{
    private int code;

    public MyException(String message,int code){
        super(message);
        this.code = code;
    }
}
