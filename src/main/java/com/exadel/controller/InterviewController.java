package com.exadel.controller;

import java.util.*;

import com.exadel.entity.*;
import com.exadel.entity.dto.InterviewDTO;
import com.exadel.service.*;
import com.exadel.service.serviceImpl.InterviewerServiceImpl;
import com.exadel.service.serviceImpl.SkillServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Timestamp;
import java.util.Map;

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

    @Autowired
    @Qualifier("skillService")
    private SkillService skillService;

    @RequestMapping(value = "/{studId}", method = RequestMethod.GET)
    public ModelAndView getInterviewForm(@PathVariable Integer studId){
        ModelAndView modelAndView = createGeneralModelAndView();
        modelAndView.addObject("studId", studId);
        modelAndView.addObject("interviewDto", new InterviewDTO());
        modelAndView.setViewName("addInterview");
        return modelAndView;
    }

    public Interview convertDtoIntoPOJO(InterviewDTO interviewDTO) {
        Map<Integer, String> marks = interviewDTO.getMarks();
        System.out.println(marks);
        Set<Map.Entry<Integer, String>> markSet = marks.entrySet();
        List<Map.Entry<Integer, String>> markList = new ArrayList<Map.Entry<Integer, String>>(markSet);
        List<Mark> resMarkList = new ArrayList<Mark>();
        for (Map.Entry<Integer, String> entry : markList) {
            Integer key = entry.getKey();
            System.out.println(key);
            String value = entry.getValue();
            Skill skill = skillService.getSkill(key);
            Mark mark = new Mark(skill, value);
            resMarkList.add(mark);
        }
        return new Interview(resMarkList, interviewDTO.getText());
    }

    @RequestMapping(value = "/add/{studId}", method = RequestMethod.POST)
    public String addInterview(@ModelAttribute("interviewDto") InterviewDTO interviewDto,
                                    @PathVariable Integer studId){
        ModelAndView modelAndView = createGeneralModelAndView();
        Student student = studentService.get(studId);
        User user = (User)modelAndView.getModel().get("curUser");
        Integer interviewerId = user.getId();
        System.out.println(interviewerId);
        Interviewer interviewer = interviewerService.getInterviewer(interviewerId);//TODO:
        Interview interview = convertDtoIntoPOJO(interviewDto);
        interview.setDate(new Timestamp(System.currentTimeMillis()));
        interview.setStudent(student);

        student.getInterviews().add(interview);
        interviewer.getInterviews().add(interview);
        interview.setInterviewer(interviewer);
        System.out.println("interviewerId : " + interviewer.getId());
        System.out.println("studentId : " + student.getId());
        interviewService.saveInterview(interview);
//        modelAndView.setViewName("addInterview");
        return  "redirect:/interview/" + studId;
    }

}