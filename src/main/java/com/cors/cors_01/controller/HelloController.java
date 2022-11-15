package com.cors.cors_01.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/custom")
public class HelloController {

    @GetMapping("")
    public String hello() {
        return "Hello from localhost:8080";
    }


}
