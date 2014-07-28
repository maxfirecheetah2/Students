package com.exadel.service.serviceImpl;


import com.exadel.dao.StudentDao;
import com.exadel.entity.Student;
import com.exadel.service.StudentService;
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


    private StudentDao getStudentDao(){
        return studentDao;
    }


    @Override
    @Transactional
    public Integer createStudent(Student student){
        return getStudentDao().create(student);
    }

    @Override
    @Transactional//TODO: Propogation??
    public List<Student> getStudentList() {
        return getStudentDao().getAll();
    }

    @Override
    @Transactional
    public void delete(Student student) {
        getStudentDao().delete(student);
    }


}
