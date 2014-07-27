package com.exadel.controller;

import com.exadel.dao.GenericDao;
import com.exadel.dao.StudentDao;
import com.exadel.dao.UserDao;
import com.exadel.service.StudentService;
import com.exadel.service.UserService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    @Qualifier("studentService")
    private StudentService studentService;

//    @Autowired
//    @Qualifier("studentDao")
//    StudentDao studentDao;
//
//    @Autowired
//    @Qualifier("sessionFactory")
//    private SessionFactory sessionFactory;

    private StudentService getStudentService(){
        return studentService;
    }
//
//    @RequestMapping(value = "/test", method = RequestMethod.GET)
//    public ModelAndView test(){
//        if(studentDao != null){
//            System.out.println("studentDao is NOT null");
//        }
//        if(studentService != null){
//            System.out.println("studentService is NOT null");
//        }
//        if(sessionFactory != null){
//            System.out.println("sessionFactory is NOT null");
//        }
//        return new ModelAndView();
//    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView studentList(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("usersList");
        modelAndView.addObject("users", studentService.getStudentList());
        return modelAndView;
    }






}
