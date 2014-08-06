package com.exadel.entity.dto;

import com.exadel.entity.User;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UserDTO implements Serializable {

    private User user;
    private List <Integer> roles = new ArrayList<Integer>();

    public UserDTO(){}

    public UserDTO(User user, List<Integer> roles){
        this.user = user;
        this.roles = roles;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Integer> getRoles() {
        return roles;
    }

    public void setRoles(List<Integer> roles) {
        this.roles = roles;
    }






}
