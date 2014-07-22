package com.exadel.entity;

import org.hibernate.type.ListType;

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

    @OneToOne
    private Student student;

    @ManyToOne
    private List <Interviewer> interviewers;

    @ManyToOne
    private List <Skill> skills;

    @Column(name = "en _level")
    private String englishLevel;

    @Column(name = "text")
    private String text;

}
