package com.exadel.entity.dto;

import com.exadel.entity.GeneralInfo;
import com.exadel.entity.Student;

/**
 * Created with IntelliJ IDEA.
 * User: X
 * Date: 08.08.14
 * Time: 12:50
 * To change this template use File | Settings | File Templates.
 */
public class StudentDTO {

    private Student student;
    private GeneralInfo generalInfo;


    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public GeneralInfo getGeneralInfo() {
        return generalInfo;
    }

    public void setGeneralInfo(GeneralInfo generalInfo) {
        this.generalInfo = generalInfo;
    }


}
