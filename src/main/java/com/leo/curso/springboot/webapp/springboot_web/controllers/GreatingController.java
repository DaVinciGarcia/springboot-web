package com.leo.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreatingController {

    @GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("message", "¡Bienvenido a Spring Boot 3!");
        return "greeting";
    }
}
