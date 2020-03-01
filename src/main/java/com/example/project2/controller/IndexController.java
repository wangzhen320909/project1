package com.example.project2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("index")
public class IndexController {

    @RequestMapping("home")
    public String home(){
        return "这是主页";
    }

}
