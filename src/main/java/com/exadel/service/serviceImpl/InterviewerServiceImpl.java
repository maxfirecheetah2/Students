package com.exadel.service.serviceImpl;

import com.exadel.dao.InterviewerDao;
import com.exadel.entity.Interviewer;
import com.exadel.service.*;
import org.springframework.security.access.annotation.Secured;


import java.util.List;

/**
 * Created by Вадим on 31.07.2014.
 */
public class InterviewerServiceImpl implements InterviewerService {

    private InterviewerDao interviewerDao;

    public InterviewerDao getInterviewerDao() {
        return interviewerDao;
    }

    @Secured("hasAnyRole('ROLE_ADMIN','ROLE_MODERATOR','ROLE_INTERVIEWER')")
    @Override
    public Integer saveInterviewer(Interviewer interviewer) {
        return getInterviewerDao().save(interviewer);
    }

    @Secured("hasAnyRole('ROLE_ADMIN','ROLE_MODERATOR','ROLE_INTERVIEWER')")
    @Override
    public List<Interviewer> getInterviewerList() {
        return getInterviewerDao().getAll();
    }

    @Secured("hasAnyRole('ROLE_ADMIN','ROLE_MODERATOR','ROLE_INTERVIEWER')")
    @Override
    public void delete(Interviewer interviewer) {
           getInterviewerDao().delete(interviewer);
    }
}

