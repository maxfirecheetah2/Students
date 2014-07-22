package com.exadel.entity;

import javax.persistence.*;
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
@PrimaryKeyJoinColumn(name = "id")
public class Student extends User {

    @OneToMany(mappedBy = "student")
    private List<Feedback> feedbacks;

    @ManyToMany(mappedBy = "students")
    private List <Tutor> tutors;

    @OneToOne
    private GeneralInfo generalInfo;

    @OneToMany(mappedBy = "student")
    private List<Practice> practices;

    @OneToMany(mappedBy = "student")
    private List<Project> projects;

    @OneToMany(mappedBy = "student")
    private List<Interview> interviews;

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
}
