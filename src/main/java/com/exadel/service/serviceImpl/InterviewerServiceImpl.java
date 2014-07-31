package com.exadel.service.serviceImpl;

import com.exadel.dao.InterviewerDao;
import com.exadel.entity.Interviewer;
import com.exadel.service.InterviewerService;

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
}

