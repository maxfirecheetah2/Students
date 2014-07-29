package com.exadel.dao.daoImpl;

import com.exadel.dao.InterviewerDao;
import com.exadel.entity.Interviewer;


/**
 * Created by Вадим on 28.07.2014.
 */
public class InterviewerDaoImpl extends GenericDaoImpl<Interviewer, Integer> implements InterviewerDao {

    public InterviewerDaoImpl() {
        super(Interviewer.class);
    }
}
