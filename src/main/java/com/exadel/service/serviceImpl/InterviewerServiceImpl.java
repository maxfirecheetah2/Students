package com.exadel.service.serviceImpl;

import com.exadel.dao.InterviewerDao;
import com.exadel.entity.Interviewer;
import com.exadel.entity.Student;
import com.exadel.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

/**
 * Created by Вадим on 31.07.2014.
 */
@Service
public class InterviewerServiceImpl implements InterviewerService {

    @Autowired
    @Qualifier("interviewerDao")
    private InterviewerDao interviewerDao;

    public InterviewerDao getInterviewerDao() {
        return interviewerDao;
    }

    @Secured({"ROLE_ADMIN","ROLE_MODERATOR","ROLE_INTERVIEWER"})
    @Override
    @Transactional
    public Integer saveInterviewer(Interviewer interviewer) {
        return getInterviewerDao().save(interviewer);
    }

    @Secured({"ROLE_ADMIN","ROLE_MODERATOR","ROLE_INTERVIEWER"})
    @Override
    @Transactional
    public List<Interviewer> getInterviewerList() {
        return getInterviewerDao().getAll();
    }

    @Secured({"ROLE_ADMIN","ROLE_MODERATOR","ROLE_INTERVIEWER"})
    @Override
    @Transactional
    public void delete(Interviewer interviewer) {
           getInterviewerDao().delete(interviewer);
    }


}

