package com.exadel.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: X
 * Date: 18.07.14
 * Time: 16:17
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table(name = "interview")
public class Interview implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="student_id")
    private Student student;

    @ManyToMany
    @JoinTable(name="interview_interviewer")
    private List<Interviewer> interviewers;

    @OneToMany(mappedBy = "interview")
    private List <Mark> skills;

    @Column(name = "en_level")
    private String englishLevel;

    @Column(name = "text")
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getEnglishLevel() {

        return englishLevel;
    }

    public void setEnglishLevel(String englishLevel) {
        this.englishLevel = englishLevel;
    }

    public List<Mark> getSkills() {

        return skills;
    }

    public void setSkills(List<Mark> skills) {
        this.skills = skills;
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

    public List<Interviewer> getInterviewers() {

        return interviewers;
    }

    public void setInterviewers(List<Interviewer> interviewers) {
        this.interviewers = interviewers;
    }



}
