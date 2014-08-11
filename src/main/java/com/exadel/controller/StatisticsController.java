package com.exadel.controller;


import com.exadel.entity.dto.*;
import com.exadel.service.serviceImpl.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/statistics")
public class StatisticsController extends BaseController {

    @Autowired
    @Qualifier("statisticsService")
    private StatisticsService statisticsService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getStatisticsForm(){
        ModelAndView modelAndView = createGeneralModelAndView();
        modelAndView.addObject("statisticsDto", new StatisticsDTO());
        modelAndView.setViewName("getStatistics");
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView printStatistics(@ModelAttribute("statisticsDto") StatisticsDTO statisticsDto, ModelAndView modelAndView){
        modelAndView.setViewName("getStatistics");
        return modelAndView;
    }

}
