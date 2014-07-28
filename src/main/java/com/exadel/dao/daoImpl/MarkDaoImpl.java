package com.exadel.dao.daoImpl;

import com.exadel.dao.MarkDao;
import com.exadel.entity.Mark;

/**
 * Created by Вадим on 28.07.2014.
 */
public class MarkDaoImpl extends GenericDaoImpl<Mark, Integer> implements MarkDao {

    public MarkDaoImpl() {
        super(Mark.class);
    }
}
