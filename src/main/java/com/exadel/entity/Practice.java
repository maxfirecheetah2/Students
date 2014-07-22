package com.exadel.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: X
 * Date: 17.07.14
 * Time: 17:24
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table(name = "practice")
public class Practice implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name = "accepted_since") // can be null : null if not accepted
    private Date acceptedSince;

    @Column(name = "practice_or_probation")
    private boolean practiceOrProbation; //true = practice false = probation

    @Column(name = "start")
    private Date start;

    @Column(name = "finish")
    private Date finish;

    @ManyToOne
    private Student student;




}
