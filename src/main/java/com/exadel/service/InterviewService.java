package com.exadel.service;

import com.exadel.entity.Interview;

import java.util.List;

/**
 * Created by Вадим on 31.07.2014.
 */
public interface InterviewService {

    public Integer saveInterview(Interview interview);
    public List<Interview> getInterviewList();
    public void delete(Interview interview);
    public Interview getInterview(Integer id);
}
