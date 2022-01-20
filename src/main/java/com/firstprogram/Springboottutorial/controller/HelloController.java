package com.firstprogram.Springboottutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("Hello")
    public String HelloWorld()
    {
        return "Hello Geek Monk !!";
    }
}
