package com.wcq.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// @RequestMapping("/table")
public class TableController {
    @GetMapping("/basic_table")
    public String basic_table(){
        // int i = 10/0;
        return "table/basic_table";
    }

    










}
