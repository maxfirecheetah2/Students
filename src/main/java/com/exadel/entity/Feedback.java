package com.exadel.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Вадим on 15.07.2014.
 */
@Entity
@Table(name = "feedback", schema = "", catalog = "exadel")
public class Feedback {

    private int id;
    private String name;
    private String surname;
    private String middlename;
    private String profLevel;
    private String diligence;
    private String sociability;
    private String profProgress;
    private String promotionNecessity;
    private byte realPrj;
    private byte realPrjNecessity;
    private byte billable;
    private String text;
    private Timestamp date;
    private int tutorId;
    private int studId;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "surname")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Column(name = "middlename")
    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    @Column(name = "prof_level")
    public String getProfLevel() {
        return profLevel;
    }

    public void setProfLevel(String profLevel) {
        this.profLevel = profLevel;
    }

    @Column(name = "diligence")
    public String getDiligence() {
        return diligence;
    }

    public void setDiligence(String diligence) {
        this.diligence = diligence;
    }

    @Column(name = "sociability")
    public String getSociability() {
        return sociability;
    }

    public void setSociability(String sociability) {
        this.sociability = sociability;
    }

    @Column(name = "prof_progress")
    public String getProfProgress() {
        return profProgress;
    }

    public void setProfProgress(String profProgress) {
        this.profProgress = profProgress;
    }

    @Column(name = "promotion_necessity")
    public String getPromotionNecessity() {
        return promotionNecessity;
    }

    public void setPromotionNecessity(String promotionNecessity) {
        this.promotionNecessity = promotionNecessity;
    }

    @Column(name = "real_prj")
    public byte getRealPrj() {
        return realPrj;
    }

    public void setRealPrj(byte realPrj) {
        this.realPrj = realPrj;
    }

    @Column(name = "real_prj_necessity")
    public byte getRealPrjNecessity() {
        return realPrjNecessity;
    }

    public void setRealPrjNecessity(byte realPrjNecessity) {
        this.realPrjNecessity = realPrjNecessity;
    }

    @Column(name = "billable")
    public byte getBillable() {
        return billable;
    }

    public void setBillable(byte billable) {
        this.billable = billable;
    }

    @Column(name = "text")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Column(name = "date")
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Column(name = "tutor_id")
    public int getTutorId() {
        return tutorId;
    }

    public void setTutorId(int tutorId) {
        this.tutorId = tutorId;
    }

    @Column(name = "stud_id")
    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }


}
