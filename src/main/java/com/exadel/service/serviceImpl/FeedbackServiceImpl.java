package com.exadel.service.serviceImpl;

import com.exadel.dao.FeedbackDao;
import com.exadel.entity.Feedback;
import com.exadel.service.FeedbackService;
import org.springframework.security.access.annotation.Secured;

import java.util.List;

/**
 * Created by Вадим on 31.07.2014.
 */
public class FeedbackServiceImpl implements FeedbackService {

    private FeedbackDao feedbackDao;

    public FeedbackDao getFeedbackDao() {
        return feedbackDao;
    }


    @Override
    public Integer saveFeedback(Feedback feedback) {
        return getFeedbackDao().save(feedback);
    }


    @Override
    public List<Feedback> getFeedbackList() {
        return getFeedbackDao().getAll();
    }

    @Override
    public void delete(Feedback feedback) {
           getFeedbackDao().delete(feedback);
    }

    @Override
    public void update(Feedback persistentObject) {
        getFeedbackDao().update(persistentObject);
    }

    @Override
    public void saveOrUpdate(Feedback persistentObject) {
        getFeedbackDao().saveOrUpdate(persistentObject);
    }


}
