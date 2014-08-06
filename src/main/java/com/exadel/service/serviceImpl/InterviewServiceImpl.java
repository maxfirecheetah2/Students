package com.exadel.service.serviceImpl;

import com.exadel.dao.InterviewDao;
import com.exadel.entity.Interview;
import com.exadel.service.*;


import java.util.List;

/**
 * Created by Вадим on 31.07.2014.
 */
public class InterviewServiceImpl implements InterviewService {

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
}
