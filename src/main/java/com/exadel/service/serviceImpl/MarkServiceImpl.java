package com.exadel.service.serviceImpl;

import com.exadel.dao.MarkDao;
import com.exadel.entity.Mark;
import com.exadel.service.*;


import java.util.List;

/**
 * Created by Вадим on 31.07.2014.
 */
public class MarkServiceImpl implements MarkService {

    private MarkDao markDao;

    public MarkDao getMarkDao() {
        return markDao;
    }

    @Override
    public Integer saveMark(Mark mark) {
        return getMarkDao().save(mark);
    }

    @Override
    public List<Mark> getMarkList() {
        return getMarkDao().getAll();
    }

    @Override
    public void delete(Mark mark) {
        getMarkDao().delete(mark);
    }
}
