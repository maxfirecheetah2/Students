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

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="student_id")
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Date getFinish() {

        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    public Date getStart() {

        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public boolean isPracticeOrProbation() {

        return practiceOrProbation;
    }

    public void setPracticeOrProbation(boolean practiceOrProbation) {
        this.practiceOrProbation = practiceOrProbation;
    }

    public Date getAcceptedSince() {

        return acceptedSince;
    }

    public void setAcceptedSince(Date acceptedSince) {
        this.acceptedSince = acceptedSince;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
