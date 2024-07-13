package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.data.annotation.Id;
@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "index"; // Return the name of the Thymeleaf template
    }
}