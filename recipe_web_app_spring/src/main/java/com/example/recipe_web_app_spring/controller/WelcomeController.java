package com.example.recipe_web_app_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    @GetMapping(value = "/")
    public String init(Model model) {
        return "index";
    }
}