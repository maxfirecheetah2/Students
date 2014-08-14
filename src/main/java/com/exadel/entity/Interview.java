package com.exadel.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;



@Entity
@Table(name = "interview")
public class Interview implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="student_id")
    private Student student;


    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="interviewer_id")
    private Interviewer interviewer;


    @OneToMany(mappedBy = "interview",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List <Mark> marks;

//    @Column(name = "en_level")
//    private String englishLevel;

    @Column(name = "text")
    private String text;

    @Column(name="date")
    private Timestamp date;

    public Interview(){}

    public Interview(List<Mark> marks, String text){
        this.marks = marks;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

//    public String getEnglishLevel() {
//
//        return englishLevel;
//    }
//
//    public void setEnglishLevel(String englishLevel) {
//        this.englishLevel = englishLevel;
//    }

    public List<Mark> getMarks() {
        return marks;
    }

    public void setMarks(List<Mark> marks) {
        this.marks = marks;
    }

    public Student getStudent() {

        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Interviewer getInterviewer() {
        return interviewer;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public void setInterviewer(Interviewer interviewer) {
        this.interviewer = interviewer;
    }



}
