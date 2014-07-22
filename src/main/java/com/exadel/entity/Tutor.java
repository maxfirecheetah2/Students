package com.exadel.entity;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "tutor")
@PrimaryKeyJoinColumn(name="id")
public class Tutor extends User {

    @OneToMany(mappedBy = "tutor")
    private List <Feedback> feedbacks;

    @ManyToMany
    @JoinTable(name="feedback")
    private List <Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Feedback> getFeedbacks() {

        return feedbacks;
    }

    public void setFeedbacks(List<Feedback> feedbacks) {
        this.feedbacks = feedbacks;
    }
}
