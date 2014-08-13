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
public class GeneralInfo implements Serializable, Cloneable {

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

    @Column(name = "session1")
    private double session1;

    @Column(name = "session2")
    private double session2;

    @Column(name = "session3")
    private double session3;

    @Column(name = "session4")
    private double session4;

    @Column(name = "session5")
    private double session5;

    @Column(name = "session6")
    private double session6;

    @Column(name = "session7")
    private double session7;

    @Column(name = "session8")
    private double session8;

    @Column(name = "session9")
    private double session9;

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

    @Override
    public GeneralInfo clone() throws CloneNotSupportedException {
        return (GeneralInfo)super.clone();
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

    public double getSession1() {
        return session1;
    }

    public void setSession1(double session1) {
        this.session1 = session1;
    }

    public double getSession2() {
        return session2;
    }

    public void setSession2(double session2) {
        this.session2 = session2;
    }

    public double getSession3() {
        return session3;
    }

    public void setSession3(double session3) {
        this.session3 = session3;
    }

    public double getSession4() {
        return session4;
    }

    public void setSession4(double session4) {
        this.session4 = session4;
    }

    public double getSession5() {
        return session5;
    }

    public void setSession5(double session5) {
        this.session5 = session5;
    }

    public double getSession6() {
        return session6;
    }

    public void setSession6(double session6) {
        this.session6 = session6;
    }

    public double getSession7() {
        return session7;
    }

    public void setSession7(double session7) {
        this.session7 = session7;
    }

    public double getSession8() {
        return session8;
    }

    public void setSession8(double session8) {
        this.session8 = session8;
    }

    public double getSession9() {
        return session9;
    }

    public void setSession9(double session9) {
        this.session9 = session9;
    }
}
