package com.exadel.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

//TODO:

/**
 * Created by Вадим on 15.07.2014.
 */
@Entity
@Table(name="general_info")
public class GeneralInfo implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "gen")
    @GenericGenerator(name = "gen", strategy = "foreign",parameters = @org.hibernate.annotations.Parameter(name = "property", value = "student"))
    private int id;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Student student;

    @Column(name = "acception_date")
    private Date acceptionDate;

    @Column(name = "probation_b4_acception")
    private byte probationB4Acception;

    @Column(name = "course_when_accepted")
    private short courseWhenAccepted;

    @Column(name = "institution")
    private String institution;

    @Column(name = "faculty")
    private String faculty;

    @Column(name = "speciality")
    private String speciality;

    @Column(name = "course")
    private short course;

    @Column(name = "`group`")
    private short group;

    @Column(name = "graduation_year")
    private short graduationYear;

    @Column(name = "gpa11_12s")
    private double gpa1112S;

    @Column(name = "gpa12_13w")
    private double gpa1213W;

    @Column(name = "gpa12_13s")
    private double gpa1213S;

    @Column(name = "gpa13_14w")
    private double gpa1314W;

    @Column(name = "gpa13_14s")
    private double gpa1314S;

    @Column(name = "list_last_prj")
    private String listLastPrj;

    @Column(name = "current_prj")
    private short currentPrj;

    @Column(name = "billable")
    private byte billable;

    @Column(name = "billable_since")
    private Date billableSince;

    @Column(name = "cur_prj_role")
    private String curPrjRole;

    @Column(name = "when_appointed_role")
    private Date whenAppointedRole;

    @Column(name = "team_lead")
    private String teamLead;

    @Column(name = "prj_manager")
    private String prjManager;

    @Column(name = "current_techs")
    private String currentTechs;

    @Column(name = "future_techs")
    private String futureTechs;

    @Column(name = "wanna_change_prj")
    private byte wannaChangePrj;

    @Column(name = "en_level")
    private String enLevel;

    @Column(name = "en_courses")
    private String enCourses;

    @Column(name="absent")
    private String absent;

    @Column(name="training")
    private String training;

    @Column(name="certificates")
    private String certificates;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Date getAcceptionDate() {
        return acceptionDate;
    }

    public void setAcceptionDate(Date acceptionDate) {
        this.acceptionDate = acceptionDate;
    }


    public byte getProbationB4Acception() {
        return probationB4Acception;
    }

    public void setProbationB4Acception(byte probationB4Acception) {
        this.probationB4Acception = probationB4Acception;
    }


    public short getCourseWhenAccepted() {
        return courseWhenAccepted;
    }

    public void setCourseWhenAccepted(short courseWhenAccepted) {
        this.courseWhenAccepted = courseWhenAccepted;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public short getCourse() {
        return course;
    }

    public void setCourse(short course) {
        this.course = course;
    }

    public short getGroup() {
        return group;
    }

    public void setGroup(short group) {
        this.group = group;
    }

    public short getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(short graduationYear) {
        this.graduationYear = graduationYear;
    }

    public short getCurrentPrj() {
        return currentPrj;
    }

    public void setCurrentPrj(short currentPrj) {
        this.currentPrj = currentPrj;
    }

    public byte getBillable() {
        return billable;
    }

    public void setBillable(byte billable) {
        this.billable = billable;
    }

    public Date getBillableSince() {
        return billableSince;
    }

    public void setBillableSince(Date billableSince) {
        this.billableSince = billableSince;
    }

    public String getCurPrjRole() {
        return curPrjRole;
    }

    public void setCurPrjRole(String curPrjRole) {
        this.curPrjRole = curPrjRole;
    }

    public Date getWhenAppointedRole() {
        return whenAppointedRole;
    }

    public void setWhenAppointedRole(Date whenAppointedRole) {
        this.whenAppointedRole = whenAppointedRole;
    }

    public String getTeamLead() {
        return teamLead;
    }

    public void setTeamLead(String teamLead) {
        this.teamLead = teamLead;
    }

    public String getPrjManager() {
        return prjManager;
    }

    public void setPrjManager(String prjManager) {
        this.prjManager = prjManager;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getCurrentTechs() {
        return currentTechs;
    }

    public void setCurrentTechs(String currentTechs) {
        this.currentTechs = currentTechs;
    }

    public String getFutureTechs() {
        return futureTechs;
    }

    public void setFutureTechs(String futureTechs) {
        this.futureTechs = futureTechs;
    }

    public byte getWannaChangePrj() {
        return wannaChangePrj;
    }

    public void setWannaChangePrj(byte wannaChangePrj) {
        this.wannaChangePrj = wannaChangePrj;
    }

    public String getEnLevel() {
        return enLevel;
    }

    public void setEnLevel(String enLevel) {
        this.enLevel = enLevel;
    }

    public String getEnCourses() {
        return enCourses;
    }

    public void setEnCourses(String enCourses) {
        this.enCourses = enCourses;
    }

    public String getCertificates() {
        return certificates;
    }

    public void setCertificates(String certificates) {
        this.certificates = certificates;
    }

    public String getTraining() {

        return training;
    }

    public void setTraining(String training) {
        this.training = training;
    }

    public String getAbsent() {

        return absent;
    }

    public void setAbsent(String absent) {
        this.absent = absent;
    }

    public String getListLastPrj() {

        return listLastPrj;
    }

    public void setListLastPrj(String listLastPrj) {
        this.listLastPrj = listLastPrj;
    }

    public double getGpa1314S() {

        return gpa1314S;
    }

    public void setGpa1314S(double gpa1314S) {
        this.gpa1314S = gpa1314S;
    }

    public double getGpa1314W() {

        return gpa1314W;
    }

    public void setGpa1314W(double gpa1314W) {
        this.gpa1314W = gpa1314W;
    }

    public double getGpa1213S() {

        return gpa1213S;
    }

    public void setGpa1213S(double gpa1213S) {
        this.gpa1213S = gpa1213S;
    }

    public double getGpa1213W() {

        return gpa1213W;
    }

    public void setGpa1213W(double gpa1213W) {
        this.gpa1213W = gpa1213W;
    }

    public double getGpa1112S() {

        return gpa1112S;
    }

    public void setGpa1112S(double gpa1112S) {
        this.gpa1112S = gpa1112S;
    }
}
