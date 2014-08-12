package com.exadel.service;

import com.exadel.entity.Interview;
import com.exadel.entity.Interviewer;
import com.exadel.entity.Student;

import java.util.List;

/**
 * Created by Вадим on 31.07.2014.
 */
public interface InterviewerService {

    public Integer saveInterviewer(Interviewer interviewer);
    public List<Interviewer> getInterviewerList();
    public void delete(Interviewer interviewer);
    public List<Student> getStudentsByInterviewerId(Integer id);
    public Interviewer getInterviewer(Integer id);
}
