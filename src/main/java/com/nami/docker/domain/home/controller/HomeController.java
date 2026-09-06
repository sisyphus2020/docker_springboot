package com.nami.docker.domain.home.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @Controller + @ResponseBody
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Hello, Docker gradle 빌드";
    }
}
