package com.exadel.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "tutor")
public class Tutor  {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "gen")
    @GenericGenerator(name = "gen", strategy = "foreign",parameters = @org.hibernate.annotations.Parameter(name = "property", value = "user"))
    private int id;

    @OneToMany(mappedBy = "tutor",fetch = FetchType.LAZY)
    private List <Feedback> feedbacks;

    @ManyToMany
    @JoinTable(name="feedback")
    private List <Student> students;

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    User user;

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
