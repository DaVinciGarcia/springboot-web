package com.leo.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leo.curso.springboot.webapp.springboot_web.models.User;
import com.leo.curso.springboot.webapp.springboot_web.models.dto.UserSimpleDTO;

@RestController
public class UserRestControllerDTO {

    @GetMapping("/api/PlainDTO")
    public UserSimpleDTO getUser() {
        User user = new User(33, "Leonardo", "leonardo@consulting.com");
        UserSimpleDTO returnedDTO= new UserSimpleDTO(user.getId(),user.getName());
        return(returnedDTO);
    }
}
