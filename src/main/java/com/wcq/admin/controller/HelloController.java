package com.wcq.admin.controller;

import com.wcq.admin.bean.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping
@Controller
public class HelloController {

    @Value("${MAVEN_HOME}")
    private String msg;

    @GetMapping("/hello")
    @ResponseBody
    public String hello (){

        return msg;
    }





}
