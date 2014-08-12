package com.exadel.service.serviceImpl;

import com.exadel.dao.InterviewDao;
import com.exadel.entity.Interview;
import com.exadel.entity.Interviewer;
import com.exadel.entity.Student;
import com.exadel.entity.Tutor;
import com.exadel.service.*;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

/**
 * Created by Вадим on 31.07.2014.
 */
@Service
public class InterviewServiceImpl implements InterviewService {

    @Autowired
    @Qualifier("interviewDao")
    private InterviewDao interviewDao;

    public InterviewDao getInterviewDao() {
        return interviewDao;
    }

    @Override
    public Integer saveInterview(Interview interview) {
        return getInterviewDao().save(interview);
    }

    @Override
    public List<Interview> getInterviewList() {
        return getInterviewDao().getAll();
    }

    @Override
    public void delete(Interview interview) {
           getInterviewDao().delete(interview);
    }


    public Interview getInterview(Integer id) {
        return getInterviewDao().get(id);
    }



}
