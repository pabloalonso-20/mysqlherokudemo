package com.wozu.mySQL.HerokuDemo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "Welcome to my home page";
    }

}
