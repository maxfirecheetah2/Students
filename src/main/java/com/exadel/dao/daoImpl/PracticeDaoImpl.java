package com.exadel.dao.daoImpl;

import com.exadel.dao.PracticeDao;
import com.exadel.entity.Practice;


/**
 * Created by Вадим on 28.07.2014.
 */
public class PracticeDaoImpl extends GenericDaoImpl<Practice, Integer> implements PracticeDao {

    public PracticeDaoImpl() {
        super(Practice.class);
    }
}
