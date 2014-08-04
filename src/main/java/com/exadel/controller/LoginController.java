package com.exadel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;

@Controller
public class LoginController extends BaseController{


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginLoad() {
        System.out.println("Login form is loading");
        return "login";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout() {
        System.out.println("Login form is loading");
        return "login";
    }
}