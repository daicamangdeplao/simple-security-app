package com.example.simplesecurityapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class Controller {

    @GetMapping("/resources")
    public String greet() {
        return "Hello, World";
    }
}