package com.exadel.controller;

import com.exadel.entity.Role;
import com.exadel.entity.User;
import com.exadel.service.UserService;
import com.exadel.service.serviceImpl.AuthService;
import org.hibernate.engine.jdbc.spi.SqlExceptionHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLDataException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class BaseController{

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    ModelAndView createGeneralModelAndView(){
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String login = auth.getName();
        User user = userService.getUserByLogin(login);
        modelAndView.addObject("curUser", user);
        return modelAndView;
    }


    public String priorityResolver(){

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        List<SimpleGrantedAuthority> roles = (List<SimpleGrantedAuthority>) auth.getAuthorities();
        if(roles.contains(new SimpleGrantedAuthority("ROLE_ADMIN"))) {
            return "full_access";
        }
        else if(roles.contains(new SimpleGrantedAuthority("ROLE_TUTOR"))){
            return "tutor_access";
        }
        else if(roles.contains(new SimpleGrantedAuthority("ROLE_INTERVIEWER"))){
            return "interviewer_access";
        }
        else if(roles.contains(new SimpleGrantedAuthority("ROLE_TUTOR")) &&
                roles.contains(new SimpleGrantedAuthority("ROLE_INTERVIEWER"))){
            return "double_access";
        }
        return "access_none";

    }

    @ExceptionHandler(Exception.class)
    public ModelAndView handleException(Exception ex){
        ModelAndView modelAndView = new ModelAndView("errorPage") ;
        modelAndView.addObject("msg", "Something went wrong!");
        return modelAndView;
    }

}
