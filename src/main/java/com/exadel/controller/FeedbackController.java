package com.exadel.controller;

import com.exadel.entity.Feedback;
import com.exadel.entity.Student;
import com.exadel.entity.Tutor;
import com.exadel.entity.User;
import com.exadel.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Timestamp;

@Controller
@RequestMapping("/feedback")
public class FeedbackController extends BaseController {

    @Autowired
    @Qualifier("feedbackService")
    private FeedbackService feedbackService;

    @Autowired
    @Qualifier("studentService")
    private StudentService studentService;

    @Autowired
    @Qualifier("tutorService")
    private TutorService tutorService;

    public FeedbackController() {}


    @RequestMapping(value = "/{studId}", method = RequestMethod.GET)
    public ModelAndView getFeedbackForm(@PathVariable("studId") Integer studId){
        ModelAndView modelAndView = createGeneralModelAndView();
        modelAndView.addObject("studId", studId);
        Student stud = studentService.get(studId);
        modelAndView.addObject("student", stud);
        modelAndView.addObject("feedback", new Feedback());
        modelAndView.setViewName("addFeedback");
        return modelAndView;
    }

    @RequestMapping(value = "/add/{studId}", method = RequestMethod.POST)
    public ModelAndView addFeedback(@ModelAttribute("feedback") Feedback feedback,
                                    @PathVariable Integer studId){
        ModelAndView modelAndView = createGeneralModelAndView();
        Student student = studentService.get(studId);
        User user = (User)modelAndView.getModel().get("curUser");
        Integer tutorId = user.getId();
        Tutor tutor = tutorService.get(tutorId);
        feedback.setDate(new Timestamp(System.currentTimeMillis()));
        feedback.setStudent(student);
        feedback.setTutor(tutor);
        feedbackService.saveFeedback(feedback);
        modelAndView.setViewName("addFeedback");
        return  modelAndView;
    }

}
