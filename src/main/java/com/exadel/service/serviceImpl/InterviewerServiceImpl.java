package com.exadel.service.serviceImpl;

import com.exadel.dao.InterviewerDao;
import com.exadel.entity.Interviewer;
import com.exadel.entity.Student;
import com.exadel.service.*;
import org.hibernate.Hibernate;
import org.springframework.security.access.annotation.Secured;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

/**
 * Created by Вадим on 31.07.2014.
 */
public class InterviewerServiceImpl implements InterviewerService {

    private InterviewerDao interviewerDao;

    public InterviewerDao getInterviewerDao() {
        return interviewerDao;
    }


    @Override
    public Integer saveInterviewer(Interviewer interviewer) {
        return getInterviewerDao().save(interviewer);
    }


    @Override
    public List<Interviewer> getInterviewerList() {
        return getInterviewerDao().getAll();
    }


    @Override
    public void delete(Interviewer interviewer) {
           getInterviewerDao().delete(interviewer);
    }

    @Transactional
    public List<Student> getStudentsByInterviewerId(Integer id){
        Interviewer interviewer =  getInterviewerDao().get(id);
        List<Student> students = interviewer.getStudents();
        Hibernate.initialize(students);
        return students;
    }
}

