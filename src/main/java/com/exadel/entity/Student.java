package com.exadel.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: X
 * Date: 17.07.14
 * Time: 17:24
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table(name = "student")
public class Student implements Serializable, Cloneable {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "gen")
    @GenericGenerator(name = "gen", strategy = "foreign",parameters = @org.hibernate.annotations.Parameter(name = "property", value = "user"))
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    User user;

    @OneToMany(mappedBy = "student",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Feedback> feedbacks;

    @ManyToMany(mappedBy = "students",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List <Tutor> tutors;

    @OneToOne(mappedBy = "student",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private GeneralInfo generalInfo;

    @OneToMany(mappedBy = "student",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Practice> practices;

    @OneToMany(mappedBy = "student",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Project> projects;

    @OneToMany(mappedBy = "student",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Interview> interviews;

    public Student(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public List<Interview> getInterviews() {
        return interviews;
    }

    public void setInterviews(List<Interview> interviews) {
        this.interviews = interviews;
    }

    public List<Project> getProjects() {

        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public List<Practice> getPractices() {

        return practices;
    }

    public void setPractices(List<Practice> practices) {
        this.practices = practices;
    }

    public GeneralInfo getGeneralInfo() {

        return generalInfo;
    }

    public void setGeneralInfo(GeneralInfo generalInfo) {
        this.generalInfo = generalInfo;
    }

    public List<Tutor> getTutors() {

        return tutors;
    }

    public void setTutors(List<Tutor> tutors) {
        this.tutors = tutors;
    }

    public List<Feedback> getFeedbacks() {

        return feedbacks;
    }

    public void setFeedbacks(List<Feedback> feedbacks) {
        this.feedbacks = feedbacks;
    }


    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student)super.clone();
    }


}
