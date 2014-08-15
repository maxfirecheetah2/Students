package com.exadel.entity.dto;


import com.exadel.entity.Student;
import com.exadel.entity.Tutor;

import java.util.List;

public class StudentDTO {

    private Student student;
    private List<Integer> tutors;

    public Student getStudent() {

        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Integer> getTutors() {
        return tutors;
    }

    public void setTutors(List<Integer> tutors) {
        this.tutors = tutors;
    }


}
