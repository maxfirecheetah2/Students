package com.exadel.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;



//TODO: rename!
/**
 * Created by Вадим on 15.07.2014.
 */
@Entity
@Table(name="info")
public class GeneralInfo implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Student student;

    @Column(name = "acception_date")
    private int acceptionDate;

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

    @Column(name = "group")
    private short group;

    @Column(name = "graduation_year")
    private short graduationYear;

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





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getAcceptionDate() {
        return acceptionDate;
    }

    public void setAcceptionDate(int acceptionDate) {
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


}
