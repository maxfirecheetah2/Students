package com.exadel.service;


import com.exadel.entity.Feedback;

import java.util.List;

/**
 * Created by Вадим on 28.07.2014.
 */
public interface FeedbackService {

    public Integer saveFeedback(Feedback feedback);
    public List<Feedback> getFeedbackList();
    public void delete(Feedback feedback);
}
