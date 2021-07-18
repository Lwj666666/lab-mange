package com.example.springmvcexamples.example02.controller;

import com.example.springmvcexamples.VO.ResultVO;
import com.example.springmvcexamples.example02.exception.MyException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class ExceptionController02 {
    @ExceptionHandler(MyException.class)
    public ResultVO handleValidException(MyException myException){
        return ResultVO.error(myException.getCode(),myException.getMessage());
    }
}
