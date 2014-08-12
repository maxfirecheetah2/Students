package com.exadel.service.serviceImpl;

import com.exadel.dao.FeedbackDao;
import com.exadel.entity.Feedback;
import com.exadel.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.annotation.Secured;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Вадим on 31.07.2014.
 */

public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    @Qualifier("feedbackDao")
    private FeedbackDao feedbackDao;

    public FeedbackDao getFeedbackDao() {
        return feedbackDao;
    }


    @Override
    @Transactional
    public Integer saveFeedback(Feedback feedback) {
        return getFeedbackDao().save(feedback);
    }


    @Override
    @Transactional
    public List<Feedback> getFeedbackList() {
        return getFeedbackDao().getAll();
    }

    @Override
    @Transactional
    public void delete(Feedback feedback) {
           getFeedbackDao().delete(feedback);
    }

    @Override
    @Transactional
    public void update(Feedback persistentObject) {
        getFeedbackDao().update(persistentObject);
    }

    @Override
    @Transactional
    public void saveOrUpdate(Feedback persistentObject) {
        getFeedbackDao().saveOrUpdate(persistentObject);
    }


}
