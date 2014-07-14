package com.exadel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping(value = "/test.form",method = RequestMethod.GET)
    public String test(@RequestParam("name") String param,Model model){
        model.addAttribute("name",param);
        System.out.println("Works!");
        return "index";
    }
}