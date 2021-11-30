package com.example.firstspringapp.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/welcome")
public class HelloWorldController {

    @GetMapping("hello")
    public String getHelloMessage() {
        return "hello from bridgelabs";
    }
//
//    @PostMapping(value = "/test")
//    public String test2(@RequestHeader(name = "token") String usertoken) {
//        return usertoken;
//    }
//
//    @GetMapping("/param/{name}")
//    public String sayHelloParam(@PathVariable String name) {
//        return "hello" + ".." + name;
//    }
//
//    @PostMapping("/post")
//    public String sayHello(@RequestBody List<EmployeDto> employeDtoList) {
//        return employeDtoList.toString();
//    }

}
