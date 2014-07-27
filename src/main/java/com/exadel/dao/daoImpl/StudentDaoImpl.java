package com.exadel.dao.daoImpl;


import com.exadel.dao.StudentDao;
import com.exadel.entity.Student;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Repository;

public class StudentDaoImpl extends GenericDaoImpl<Student, Integer> implements StudentDao {

    public StudentDaoImpl() {
        super(Student.class);
    }
}
