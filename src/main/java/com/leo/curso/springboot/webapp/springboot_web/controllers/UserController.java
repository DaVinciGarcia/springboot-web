package com.leo.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        model.addAttribute("title", "Cambiar Titulo");
        model.addAttribute("name", "Leonardo");
        model.addAttribute("lastname", "Garcia");

        return "details";

    }
}
