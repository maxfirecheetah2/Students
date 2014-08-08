package com.exadel.service;

import com.exadel.entity.Student;
import com.exadel.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

//    public Integer saveStudent(Student student);
    public List<Student> getStudentList();
    public void delete(Student student);
    public Student get(Integer id);
    public void saveOrUpdate(Student persistentObject);
    public void update(Student persistentObject);

}
