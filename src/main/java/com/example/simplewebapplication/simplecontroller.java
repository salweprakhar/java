package com.example.simplewebapplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public  class simplecontroller {
    @RequestMapping("/")
    public String index()
    {
        return "hello world";
    }
}