package com.leo.curso.springboot.webapp.springboot_web.models.dto;

import com.leo.curso.springboot.webapp.springboot_web.models.User;

public class UserDTO {
    private int id;
    private User user;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    
}
