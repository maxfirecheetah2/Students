package com.exadel.controller;


import com.exadel.service.UserService;
import com.exadel.service.serviceImpl.MailService;
import com.exadel.service.serviceImpl.PdfDocumentService;
import com.exadel.service.serviceImpl.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

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