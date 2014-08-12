package com.exadel.service.serviceImpl;

import com.exadel.dao.MarkDao;
import com.exadel.entity.Mark;
import com.exadel.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

/**
 * Created by Вадим on 31.07.2014.
 */
@Service
public class MarkServiceImpl implements MarkService {

    @Autowired
    @Qualifier("markDao")
    private MarkDao markDao;

    public MarkDao getMarkDao() {
        return markDao;
    }

    @Override
    @Transactional
    public Integer saveMark(Mark mark) {
        return getMarkDao().save(mark);
    }

    @Override
    @Transactional
    public List<Mark> getMarkList() {
        return getMarkDao().getAll();
    }

    @Override
    @Transactional
    public void delete(Mark mark) {
        getMarkDao().delete(mark);
    }
}
