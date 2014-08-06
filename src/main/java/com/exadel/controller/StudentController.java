package com.exadel.controller;

import com.exadel.dao.GenericDao;
import com.exadel.dao.StudentDao;
import com.exadel.dao.UserDao;
import com.exadel.entity.Student;
import com.exadel.entity.User;
import com.exadel.service.StudentService;
import com.exadel.service.UserService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("/student")
public class StudentController extends BaseController{

    @Autowired
    @Qualifier("studentService")
    private StudentService studentService;


    private StudentService getStudentService(){
        return studentService;
    }


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView studentList(){

        ModelAndView modelAndView = createGeneralModelAndView();
        modelAndView.setViewName("studentList");
        List<Student> list =  studentService.getStudentList();
        modelAndView.addObject("users", list);
        modelAndView.addObject("role", "student");
        return modelAndView;

    }


    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public ModelAndView editStudent(@PathVariable int id,
                       @RequestParam(value = "student", required = true) Student student){
        ModelAndView modelAndView = createGeneralModelAndView();
        return null;
    }

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public ModelAndView getProfile(){
        ModelAndView modelAndView = createGeneralModelAndView();
        modelAndView.setViewName("studentProfile");
        return modelAndView;
    }






}
