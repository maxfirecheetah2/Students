package com.exadel.controller;

import com.exadel.dao.GenericDao;
import com.exadel.dao.StudentDao;
import com.exadel.dao.UserDao;
import com.exadel.entity.*;
import com.exadel.service.FeedbackService;

import com.exadel.service.*;
import com.exadel.service.StudentService;
import com.exadel.service.UserService;
import com.exadel.service.serviceImpl.GeneralInfoServiceImpl;
import com.exadel.service.serviceImpl.TutorServiceImpl;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/student")
public class StudentController extends BaseController{

    @Autowired
    @Qualifier("studentService")
    private StudentService studentService;

    @Autowired
    @Qualifier("tutorService")
    private TutorService tutorService;

    @Autowired
    @Qualifier("interviewService")
    private InterviewService interviewService;

    @Autowired
    @Qualifier("feedbackService")
    private FeedbackService feedbackService;

    @Autowired
    @Qualifier("interviewerService")
    private InterviewerService interviewerService;

    @Autowired
    @Qualifier("generalInfoService")
    private GeneralInfoService generalInfoService;


    private StudentService getStudentService(){
        return studentService;
    }



    @RequestMapping(value = "/list/full_access", method = RequestMethod.GET)
    public ModelAndView fullStudentList(){

        ModelAndView modelAndView = createGeneralModelAndView();
        modelAndView.setViewName("studentList");
        List<Student> list =  studentService.getStudentList();
        modelAndView.addObject("users", list);
        modelAndView.addObject("role", "student");
        return modelAndView;

    }


    @RequestMapping(value = "/list/interviewer_access", method = RequestMethod.GET)
    public ModelAndView studentListForInterviewer(){

        ModelAndView modelAndView = createGeneralModelAndView();
        modelAndView.setViewName("studentList");
        User user =  (User) modelAndView.getModel().get("curUser");
        List<Student> students = studentService.getStudentList();
        modelAndView.addObject("users", students);
        modelAndView.addObject("role", "student");
        return modelAndView;

    }

    @RequestMapping(value = "/list/tutor_access", method = RequestMethod.GET)
    public ModelAndView studentListForTutor(){

        ModelAndView modelAndView = createGeneralModelAndView();
        modelAndView.setViewName("studentList");
        User user =  (User) modelAndView.getModel().get("curUser");
        List<Student> students = tutorService.getStudentsByTutorId(user.getId());
        modelAndView.addObject("users", students);
        modelAndView.addObject("role", "student");
        return modelAndView;

    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ModelAndView viewStudent(@PathVariable Integer id){
        ModelAndView modelAndView = createGeneralModelAndView();
        Student student = studentService.get(id);
        System.out.println(student);
        if(student.getGeneralInfo() == null) {
            student.setGeneralInfo(new GeneralInfo());
        }
        modelAndView.addObject("student", student);
        modelAndView.setViewName("studentProfile");
        return modelAndView;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public ModelAndView editStudent(@ModelAttribute("student") Student student){
        List<Feedback> feedbacks = studentService.getFeedbackList();
        System.out.println(feedbacks + " feedbacks!");
//        List<Interview> interviews = interviewerService.getInterviewList();
        ModelAndView modelAndView = createGeneralModelAndView();
        student.getGeneralInfo().setStudent(student);
        studentService.update(student);
        modelAndView.setViewName("studentProfile");
        modelAndView.addObject("feedbacks", feedbacks);
        return modelAndView;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String studentListForwarding() {
        System.out.println(priorityResolver());
        return "redirect:/student/list/" + priorityResolver();
    }



}
