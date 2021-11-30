package com.example.firstspringapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/welcome")
public class HelloWorldController {
    @GetMapping("hello")
        public String getHelloMessage() {
        return "hello from bridgelabs";


    }
}
