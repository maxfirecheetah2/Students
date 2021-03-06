package com.exadel.controller;

import com.exadel.entity.Role;
import com.exadel.entity.User;
import com.exadel.entity.dto.UserDTO;
import com.exadel.service.UserService;
import com.exadel.util.PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.management.relation.RoleStatus;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    private static final String DEFAULT_PASSWORD = "11111";

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView createUser(@ModelAttribute("userDto") UserDTO userDto){

        ModelAndView modelAndView = createGeneralModelAndView();
        String pass_encoded =  PasswordEncoder.getEncryptedPassword(DEFAULT_PASSWORD);
        userDto.getUser().setPassword(pass_encoded);
        try {
            userService.saveUser(userDto);
        }
        catch (Exception ex){
             modelAndView.setViewName("errorPage");
             modelAndView.addObject("msg", "Error while trying to add a user : "+ex.getMessage());
             return modelAndView;
        }
        modelAndView.setViewName("createUser");
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView obtainForm(){
        ModelAndView modelAndView = createGeneralModelAndView();
        UserDTO userDto = new UserDTO(new User(), new ArrayList<Integer>());
        userDto.getUser().setRoles(new ArrayList<Role>());
        modelAndView.addObject("userDto", userDto);
        modelAndView.setViewName("createUser");
        return modelAndView;
    }


    @RequestMapping("/myprofile")
    public ModelAndView getMyProfileForm(){
        ModelAndView modelAndView = createGeneralModelAndView();
        User user = (User) modelAndView.getModel().get("curUser");
        System.out.println(user);
        modelAndView.setViewName("myProfile");
        modelAndView.addObject("user", user);
        System.out.println("Works!");
        return modelAndView;
    }



}
