package com.exadel.service.serviceImpl;

import com.exadel.dao.PracticeDao;
import com.exadel.entity.Practice;
import com.exadel.service.PracticeService;

import java.util.List;

/**
 * Created by Вадим on 31.07.2014.
 */
public class PracticeServiceImpl implements PracticeService {

    private PracticeDao practiceDao;

    public PracticeDao getPracticeDao() {
        return practiceDao;
    }

    @Override
    public Integer savePractice(Practice practice) {
        return getPracticeDao().save(practice);
    }

    @Override
    public List<Practice> getPracticeList() {
        return getPracticeDao().getAll();
    }

    @Override
    public void delete(Practice practice) {
       getPracticeDao().delete(practice);
    }
}
