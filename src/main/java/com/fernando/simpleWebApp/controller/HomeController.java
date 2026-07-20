package com.fernando.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet()
    {
        return "Welcome to my App!";
    }

    @RequestMapping("/about")
    public String about()
    {
        return "This is not here";
    }
}
