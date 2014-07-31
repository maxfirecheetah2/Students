package com.exadel.dao.daoImpl;

import com.exadel.dao.FeedbackDao;
import com.exadel.entity.Feedback;
import com.exadel.entity.Student;
import com.exadel.entity.Tutor;

/**
 * Created by Вадим on 28.07.2014.
 */
public class FeedbackDaoImpl extends GenericDaoImpl<Feedback, Integer> implements FeedbackDao {

    public FeedbackDaoImpl() { super(Feedback.class);}


}
