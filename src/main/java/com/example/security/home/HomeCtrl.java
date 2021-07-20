package com.example.security.home;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("home")
public class HomeCtrl {

    @GetMapping
    public String get(){
        return "Welcome to Home Controller .......!";
    }
}
