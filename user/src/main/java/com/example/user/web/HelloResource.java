package com.example.user.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class HelloResource {

    @GetMapping("/hello")
    public String showByString() {
        return "hello";
    }

}
