package com.exadel.controller;

import com.exadel.dao.GenericDao;
import com.exadel.dao.StudentDao;
import com.exadel.dao.UserDao;
import com.exadel.entity.Student;
import com.exadel.service.StudentService;
import com.exadel.service.UserService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    @Qualifier("studentService")
    private StudentService studentService;

    private StudentService getStudentService(){
        return studentService;
    }


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView studentList(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("defaultTemplate");
        List<Student>list =  studentService.getStudentList();
        System.out.println(list);
        modelAndView.addObject("users", list);
        return modelAndView;
    }






}
