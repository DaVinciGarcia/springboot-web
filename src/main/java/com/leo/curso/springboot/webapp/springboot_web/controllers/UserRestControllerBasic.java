package com.leo.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestControllerBasic {

    @GetMapping("/api/hello")
    public String sayHello() {
        return "¡Hola desde un RestController!";
    }
}
