package com.exadel.controller;

import com.exadel.dao.GenericDao;
import com.exadel.dao.StudentDao;
import com.exadel.dao.UserDao;
import com.exadel.entity.*;
import com.exadel.entity.dto.StudentDTO;
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
        List<Feedback> feedbacks = feedbackService.getFeedbackList();
        List<Tutor> tutors = tutorService.getTutorList();
        modelAndView.addObject("tutors", tutors);
        modelAndView.addObject("feedbacks", feedbacks);
        Student student = studentService.get(id);
        System.out.println(student);
        if(student.getGeneralInfo() == null) {
            student.setGeneralInfo(new GeneralInfo());
        }
        StudentDTO studentDto = new StudentDTO();
        studentDto.setStudent(student);
        studentDto.setTutors(new ArrayList<Integer>());
        modelAndView.addObject("studentDto", studentDto);
        modelAndView.setViewName("studentProfile");
        return modelAndView;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String editStudent(@ModelAttribute("studentDto") StudentDTO studentDto){

//        List<Interview> interviews = interviewerService.getInterviewList();
        ModelAndView modelAndView = createGeneralModelAndView();
        Student student = studentDto.getStudent();
        student.getGeneralInfo().setStudent(student);
        List<Integer>tuts = new ArrayList<Integer>();
        List<Tutor>tutors = new ArrayList<Tutor>();
        for(Integer id : tuts){
            Tutor tutor = tutorService.get(id);
            tutors.add(tutor);

        }
        student.setTutors(tutors);
        studentService.update(student);
        return "redirect:/student/" + student.getUser().getId();
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String studentListForwarding() {
        System.out.println(priorityResolver());
        return "redirect:/student/list/" + priorityResolver();
    }



}
