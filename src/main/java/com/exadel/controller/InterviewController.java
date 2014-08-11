package com.exadel.controller;

import com.exadel.entity.Interview;
import com.exadel.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/interview")
public class InterviewController extends BaseController {

    @Autowired
    @Qualifier("interviewService")
    private InterviewService interviewService;

    @RequestMapping(value = "/{studId}", method = RequestMethod.GET)
    public ModelAndView getInterviewForm(@PathVariable Integer studId){
        ModelAndView modelAndView = createGeneralModelAndView();
        modelAndView.addObject("studId", studId);
        modelAndView.addObject("interview", new Interview());
        modelAndView.setViewName("addInterview");
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView addInterview(@ModelAttribute("interview") Interview interview, ModelAndView modelAndView){
        modelAndView.setViewName("addInterview");
        return  modelAndView;
    }

}