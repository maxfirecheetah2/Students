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

    @Secured("hasAnyRole('ROLE_ADMIN','ROLE_MODERATOR','ROLE_TUTOR')")
    @Override
    public Integer saveFeedback(Feedback feedback) {
        return getFeedbackDao().save(feedback);
    }

    @Secured("hasAnyRole('ROLE_ADMIN','ROLE_MODERATOR','ROLE_TUTOR')")
    @Override
    public List<Feedback> getFeedbackList() {
        return getFeedbackDao().getAll();
    }

    @Secured("hasAnyRole('ROLE_ADMIN','ROLE_MODERATOR','ROLE_TUTOR')")
    @Override
    public void delete(Feedback feedback) {
           getFeedbackDao().delete(feedback);
    }
}
