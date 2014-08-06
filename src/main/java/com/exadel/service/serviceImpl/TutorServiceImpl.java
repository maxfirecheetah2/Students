package com.exadel.service.serviceImpl;

import com.exadel.dao.TutorDao;
import com.exadel.entity.Tutor;
import com.exadel.service.*;


import java.util.List;

/**
 * Created by Вадим on 31.07.2014.
 */
public class TutorServiceImpl implements TutorService {

    private TutorDao tutorDao;


    public TutorDao getTutorDao(){return this.tutorDao;}



    @Override
    public Integer saveTutor(Tutor tutor){
           return getTutorDao().save(tutor);
    }

    @Override
    public List<Tutor> getTutorList() {
        return getTutorDao().getAll();
    }

    @Override
    public void delete(Tutor tutor) {
         getTutorDao().delete(tutor);
    }
}
