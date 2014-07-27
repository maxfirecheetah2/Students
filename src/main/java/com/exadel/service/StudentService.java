package com.exadel.service;

import com.exadel.entity.Student;
import com.exadel.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    public Integer createStudent(Student student);
    public List<Student> getStudentList();
    public void delete(Student student);

}
