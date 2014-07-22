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

    @ManyToOne
    private GeneralInfo generalInfo;

//    @ManyToOne
//    private Practice practice;

    @Column(name = "test")
    private String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }





}
