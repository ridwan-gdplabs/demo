package com.example.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hello")
public class HelloWorldController {

    @GetMapping
    public String helloWorld() {
        return "hello world";
    }

}
