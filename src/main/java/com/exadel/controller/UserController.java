package com.exadel.controller;

import com.exadel.entity.Role;
import com.exadel.entity.User;
import com.exadel.entity.dto.UserDTO;
import com.exadel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView createUser(@ModelAttribute("userDto") UserDTO userDto) {

        ModelAndView modelAndView = createGeneralModelAndView();
        userDto.getUser().setPassword("11111");
        userService.saveUser(userDto);
        modelAndView.setViewName("createUser");
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView obtainForm(){
        ModelAndView modelAndView = createGeneralModelAndView();
        UserDTO userDto = new UserDTO(new User(), new ArrayList<Integer>());
        userDto.getUser().setRoles(new ArrayList<Role>()); //TODO:
        modelAndView.addObject("userDto", userDto);
        modelAndView.setViewName("createUser");
        return modelAndView;
    }



}
