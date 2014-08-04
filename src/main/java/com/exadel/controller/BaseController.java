package com.exadel.controller;

import com.exadel.entity.User;
import com.exadel.service.UserService;
import com.exadel.service.serviceImpl.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

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
        System.out.println(user.getRole());
        modelAndView.addObject("curUser", user);
        return modelAndView;
    }


}
