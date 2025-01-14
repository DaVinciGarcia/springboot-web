package com.leo.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leo.curso.springboot.webapp.springboot_web.models.User;
import com.leo.curso.springboot.webapp.springboot_web.models.dto.UserDTO;

@RestController
public class UserRestControllerDTOAnidado {

    @GetMapping("/api/DTOAnidado")
    public UserDTO getUser() {
        UserDTO DTOapiUser= new UserDTO();
        User user = new User(33,"Luis", "luis@gmail.com");
        int idDTO = 69;
        DTOapiUser.setUser(user);
        DTOapiUser.setId(idDTO);
        //return new User(1, "Juan", "juan@example.com");
        return(DTOapiUser);
    }
}
