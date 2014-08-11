package com.exadel.controller;

import com.exadel.entity.Tutor;
import com.exadel.entity.User;
import com.exadel.service.*;
import com.exadel.service.serviceImpl.TutorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController extends BaseController {

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @Autowired
    @Qualifier("tutorService")
    private TutorService tutorService;

    @Autowired
    @Qualifier("interviewerService")
    private InterviewerService interviewerService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home(){
        return "redirect:login";
    }


    @RequestMapping(value = "/moderators",method = RequestMethod.GET)
    public ModelAndView moderators(){
        ModelAndView modelAndView = createGeneralModelAndView();
        modelAndView.addObject("users", userService.getUsersByRole(4));
        modelAndView.addObject("role", "Moderators");
        modelAndView.setViewName("userList");
        return modelAndView;
    }

    @RequestMapping(value = "/interviewers",method = RequestMethod.GET)
    public ModelAndView interviewers(){
        ModelAndView modelAndView = createGeneralModelAndView();
        modelAndView.addObject("users", userService.getUsersByRole(3));
        modelAndView.addObject("role", "Interviewers");
        modelAndView.setViewName("userList");
        return modelAndView;
    }

    @RequestMapping(value = "/tutors",method = RequestMethod.GET)
    public ModelAndView tutors(){
        ModelAndView modelAndView = createGeneralModelAndView();
        modelAndView.addObject("users", userService.getUsersByRole(2));
        modelAndView.addObject("role", "Tutors");
        modelAndView.setViewName("userList");
        return modelAndView;
    }
}