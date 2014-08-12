package com.exadel.service.serviceImpl;

import com.exadel.dao.TutorDao;
import com.exadel.entity.Student;
import com.exadel.entity.Tutor;
import com.exadel.service.*;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

/**
 * Created by Вадим on 31.07.2014.
 */
@Service
public class TutorServiceImpl implements TutorService {

    @Autowired
    @Qualifier("tutorDao")
    private TutorDao tutorDao;


    public TutorDao getTutorDao(){return this.tutorDao;}



    @Transactional
    @Override
    public Integer saveTutor(Tutor tutor){
           return getTutorDao().save(tutor);
    }

    @Transactional
    @Override
    public List<Tutor> getTutorList() {
        return getTutorDao().getAll();
    }

    @Transactional
    @Override
    public void delete(Tutor tutor) {
         getTutorDao().delete(tutor);
    }

    @Transactional
    @Override
    public Tutor get(Integer id) {
      return  getTutorDao().get(id);
    }

    @Transactional
    @Override
    public Tutor load(Integer id) {
        return getTutorDao().load(id);
    }

    @Transactional
    @Override
    public List<Student> getStudentsByTutorId(Integer id) {
        Tutor tutor=getTutorDao().get(id);
        Hibernate.initialize(tutor.getStudents());
        return tutor.getStudents();
    }
}
