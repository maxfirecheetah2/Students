package com.exadel.service;


import com.exadel.entity.Feedback;
import com.exadel.entity.Student;

import java.util.List;

/**
 * Created by Вадим on 28.07.2014.
 */
public interface FeedbackService {

    public Integer saveFeedback(Feedback feedback);
    public List<Feedback> getFeedbackList();
    public void delete(Feedback feedback);
    public void update(Feedback persistentObject);
    public void saveOrUpdate(Feedback persistentObject);
}
