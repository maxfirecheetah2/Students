package com.exadel.controller;

import com.exadel.dao.GenericDao;
import com.exadel.dao.StudentDao;
import com.exadel.dao.UserDao;
import com.exadel.entity.Feedback;
import com.exadel.entity.GeneralInfo;
import com.exadel.entity.Student;
import com.exadel.entity.User;
import com.exadel.service.FeedbackService;

import com.exadel.service.*;
import com.exadel.service.StudentService;
import com.exadel.service.UserService;
import com.exadel.service.serviceImpl.GeneralInfoServiceImpl;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("/student")
public class StudentController extends BaseController{

    @Autowired
    @Qualifier("studentService")
    private StudentService studentService;

    @Autowired
    @Qualifier("generalInfoService")
    private GeneralInfoService generalInfoService;


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


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ModelAndView viewStudent(@PathVariable Integer id){
        ModelAndView modelAndView = createGeneralModelAndView();
        Student student = studentService.get(id);
        GeneralInfo generalInfo = new GeneralInfo();
        student.setGeneralInfo(generalInfo);
        System.out.println(student);
//        generalInfo.setStudent(student);
        modelAndView.addObject("student", student);
        modelAndView.setViewName("studentProfile");
        return modelAndView;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public ModelAndView editStudent(@ModelAttribute("student") Student student){
        ModelAndView modelAndView = createGeneralModelAndView();
        System.out.println(student);
        student.getGeneralInfo().setStudent(student);
        studentService.update(student);
        modelAndView.setViewName("studentProfile");
        return modelAndView;
    }



}
