package com.exadel.dao.daoImpl;

import com.exadel.dao.InterviewDao;
import com.exadel.entity.Interview;


/**
 * Created by Вадим on 28.07.2014.
 */
public class InterviewDaoImpl extends GenericDaoImpl<Interview, Integer> implements InterviewDao {

    public InterviewDaoImpl() {
        super(Interview.class);
    }
}
