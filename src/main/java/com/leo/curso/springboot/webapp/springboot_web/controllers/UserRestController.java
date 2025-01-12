package com.leo.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leo.curso.springboot.webapp.springboot_web.models.User;

@RestController
public class UserRestController {

    @GetMapping("/api/user")
    public User getUser() {
        return new User(1, "Juan", "juan@example.com");
    }
}
