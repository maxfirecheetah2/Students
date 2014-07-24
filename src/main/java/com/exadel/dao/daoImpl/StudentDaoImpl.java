package com.exadel.dao.daoImpl;


import com.exadel.dao.StudentDao;
import com.exadel.entity.Student;

public class StudentDaoImpl extends GenericDaoImpl<Student, Integer> implements StudentDao {

    public StudentDaoImpl() {
        super(Student.class);
    }
}
