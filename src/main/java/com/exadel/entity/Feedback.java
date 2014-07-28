package com.exadel.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Вадим on 15.07.2014.
 */
@Entity
@Table(name = "feedback")
public class Feedback implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;


    @Column(name = "prof_level")
    private String profLevel;

    @Column(name = "diligence")
    private String diligence;

    @Column(name = "sociability")
    private String sociability;

    @Column(name = "prof_progress")
    private String profProgress;

    @Column(name = "promotion_necessity")
    private String promotionNecessity;

    @Column(name = "real_prj")
    private byte realPrj;

    @Column(name = "real_prj_necessity")
    private byte realPrjNecessity;

    @Column(name = "billable")
    private byte billable;

    @Column(name = "text")
    private String text;

    @Column(name = "date")
    private Timestamp date;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="student_id")
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="tutor_id")
    private Tutor tutor;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getProfLevel() {
        return profLevel;
    }

    public void setProfLevel(String profLevel) {
        this.profLevel = profLevel;
    }


    public String getDiligence() {
        return diligence;
    }

    public void setDiligence(String diligence) {
        this.diligence = diligence;
    }


    public String getSociability() {
        return sociability;
    }

    public void setSociability(String sociability) {
        this.sociability = sociability;
    }


    public String getProfProgress() {
        return profProgress;
    }

    public void setProfProgress(String profProgress) {
        this.profProgress = profProgress;
    }

    public String getPromotionNecessity() {
        return promotionNecessity;
    }

    public void setPromotionNecessity(String promotionNecessity) {
        this.promotionNecessity = promotionNecessity;
    }

    public byte getRealPrj() {
        return realPrj;
    }

    public void setRealPrj(byte realPrj) {
        this.realPrj = realPrj;
    }

    public byte getRealPrjNecessity() {
        return realPrjNecessity;
    }

    public void setRealPrjNecessity(byte realPrjNecessity) {
        this.realPrjNecessity = realPrjNecessity;
    }

    public byte getBillable() {
        return billable;
    }

    public void setBillable(byte billable) {
        this.billable = billable;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }
}
