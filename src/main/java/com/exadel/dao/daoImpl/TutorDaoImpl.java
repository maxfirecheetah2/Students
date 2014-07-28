package com.exadel.dao.daoImpl;

import com.exadel.dao.TutorDao;
import com.exadel.entity.Tutor;

/**
 * Created by Вадим on 28.07.2014.
 */
public class TutorDaoImpl extends GenericDaoImpl<Tutor, Integer> implements TutorDao {
    public TutorDaoImpl() {
        super(Tutor.class);
    }
}
