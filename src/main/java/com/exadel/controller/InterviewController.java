package com.exadel.controller;

import com.exadel.entity.*;
import com.exadel.entity.dto.InterviewDTO;
import com.exadel.service.*;
import com.exadel.service.serviceImpl.InterviewerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Timestamp;

@Controller
@RequestMapping("/interview")
public class InterviewController extends BaseController {

    @Autowired
    @Qualifier("interviewService")
    private InterviewService interviewService;

    @Autowired
    @Qualifier("studentService")
    private StudentService studentService;

    @Autowired
    @Qualifier("interviewerService")
    private InterviewerService interviewerService;

    @RequestMapping(value = "/{studId}", method = RequestMethod.GET)
    public ModelAndView getInterviewForm(@PathVariable Integer studId){
        ModelAndView modelAndView = createGeneralModelAndView();
        modelAndView.addObject("studId", studId);
        modelAndView.addObject("interviewDto", new InterviewDTO());
        modelAndView.setViewName("addInterview");
        return modelAndView;
    }

    @RequestMapping(value = "/add/{studId}", method = RequestMethod.POST)
    public ModelAndView addFeedback(@ModelAttribute("interview") Interview interview,
                                    @PathVariable Integer studId){
        ModelAndView modelAndView = createGeneralModelAndView();
        Student student = studentService.get(studId);
        User user = (User)modelAndView.getModel().get("curUser");
        Integer interviewerId = user.getId();
        Interviewer interviewer = interviewerService.getInterviewer(interviewerId);
        interview.setDate(new Timestamp(System.currentTimeMillis()));
        interview.setStudent(student);
        interview.setInterviewer(interviewer);
        interviewService.saveInterview(interview);
        modelAndView.setViewName("addInterview");
        return  modelAndView;
    }

}