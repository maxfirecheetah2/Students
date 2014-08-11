package com.exadel.controller;


import com.exadel.entity.Student;
import com.exadel.entity.dto.EmailDTO;
import com.exadel.service.StudentService;
import com.exadel.service.serviceImpl.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/email")
public class EmailController extends BaseController {

    @Autowired
    @Qualifier("studentService")
    private StudentService studentService;

    @Autowired
    @Qualifier("mailService")
    private MailService mailService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getEmailForm(){
       ModelAndView modelAndView = createGeneralModelAndView();
       modelAndView.addObject("emailDto", new EmailDTO());
       modelAndView.setViewName("sendEmail");
       return modelAndView;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView sendForm(ModelAndView modelAndView, @ModelAttribute("emailDto") EmailDTO emailDto){
       List<Student> students = studentService.getStudentList();
       for(Student student : students){
           String email = student.getUser().getEmail();
           String title = emailDto.getTitle();
           String text = emailDto.getText();
           mailService.sendMail(email, title, text);
       }
       modelAndView.setViewName("sendEmail");
       return modelAndView;
    }

}
