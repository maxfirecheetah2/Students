package com.exadel.entity.dto;


public class StatisticsDTO {

    private boolean faculty;
    private boolean course;
    private boolean university;
    private boolean billable;
    private boolean notbillable;
    private boolean englishLevel;


    public boolean getFaculty() {
        return faculty;
    }

    public void setFaculty(boolean faculty) {
        this.faculty = faculty;
    }

    public boolean getCourse() {
        return course;
    }

    public void setCourse(boolean course) {
        this.course = course;
    }

    public boolean getUniversity() {
        return university;
    }

    public void setUniversity(boolean university) {
        this.university = university;
    }

    public boolean getBillable() {
        return billable;
    }

    public void setBillable(boolean billable) {
        this.billable = billable;
    }

    public boolean getNotbillable() {
        return notbillable;
    }

    public void setNotbillable(boolean notbillable) {
        this.notbillable = notbillable;
    }

    public void setEnglishLevel(boolean englishLevel) {
        this.englishLevel = englishLevel;
    }

    public boolean getEnglishLevel(){return englishLevel;}
}
