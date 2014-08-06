package com.exadel.controller;

import com.exadel.entity.User;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController extends BaseController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home(){
        return "redirect:login";
    }



}