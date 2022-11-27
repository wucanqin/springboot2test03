package com.wcq.admin.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.logging.Logger;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler({ArithmeticException.class, NullPointerException.class})
    public String handleArithEception(Exception e){
        log.error("异常是：{}",e);
        return "login";
    }



}
