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

    @OneToMany
    private List<Feedback> feedbacks;

    @ManyToMany
    private List<Tutor> tutorList;

    @OneToOne
    private GeneralInfo generalInfo;

    @OneToMany
    private List<Practice> practiceList;

    @OneToMany
    private List<Project> projectList;

    @OneToMany
    private List<Interview> interviewList;







}
