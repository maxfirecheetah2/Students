package com.exadel.service.serviceImpl;


import com.exadel.dao.StudentDao;
import com.exadel.entity.Role;
import com.exadel.entity.Student;
import com.exadel.entity.User;
import com.exadel.service.StudentService;
import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public class StudentServiceImpl implements StudentService {


    @Autowired
    @Qualifier("studentDao")
    private StudentDao studentDao;

//    @Autowired
//    private SessionFactory sessionFactory;


    private StudentDao getStudentDao(){
        return studentDao;
    }


    @Override
    @Transactional
    public Integer saveStudent(Student student){
        return getStudentDao().save(student);
    }

    @Override
    @Transactional
    public List<Student> getStudentList() {
        List<Student> list = getStudentDao().getAll();
        for(Student student : list){
            Hibernate.initialize(student.getGeneralInfo());
        }
        return list;
    }

    @Override
    @Transactional
    public void delete(Student student) {
        getStudentDao().delete(student);
    }




}
