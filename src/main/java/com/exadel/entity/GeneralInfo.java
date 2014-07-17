package com.exadel.entity;

import javax.persistence.*;
import java.sql.Date;


//TODO: rename!
/**
 * Created by Вадим on 15.07.2014.
 */
@Entity
@Table(name="info",schema = "", catalog = "exadel")
public class GeneralInfo {

    private int id;
    private int acceptionDate;
    private byte probationB4Acception;
    private short courseWhenAccepted;
    private String institution;
    private String faculty;
    private String speciality;
    private short course;
    private short group;
    private short graduationYear;
    private short currentPrj;
    private byte billable;
    private Date billableSince;
    private String curPrjRole;
    private Date whenAppointedRole;
    private String teamLead;
    private String prjManager;
    private int tutorId;
    private String currentTechs;
    private String futureTechs;
    private byte wannaChangePrj;
    private String enLevel;
    private String enCourses;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "acception_date")
    public int getAcceptionDate() {
        return acceptionDate;
    }

    public void setAcceptionDate(int acceptionDate) {
        this.acceptionDate = acceptionDate;
    }

    @Column(name = "probation_b4_acception")
    public byte getProbationB4Acception() {
        return probationB4Acception;
    }

    public void setProbationB4Acception(byte probationB4Acception) {
        this.probationB4Acception = probationB4Acception;
    }

    @Column(name = "course_when_accepted")
    public short getCourseWhenAccepted() {
        return courseWhenAccepted;
    }

    public void setCourseWhenAccepted(short courseWhenAccepted) {
        this.courseWhenAccepted = courseWhenAccepted;
    }

    @Column(name = "institution")
    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    @Column(name = "faculty")
    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Column(name = "speciality")
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Column(name = "course")
    public short getCourse() {
        return course;
    }

    public void setCourse(short course) {
        this.course = course;
    }

    @Column(name = "group")
    public short getGroup() {
        return group;
    }

    public void setGroup(short group) {
        this.group = group;
    }

    @Column(name = "graduation_year")
    public short getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(short graduationYear) {
        this.graduationYear = graduationYear;
    }

    @Column(name = "current_prj")
    public short getCurrentPrj() {
        return currentPrj;
    }

    public void setCurrentPrj(short currentPrj) {
        this.currentPrj = currentPrj;
    }

    @Column(name = "billable")
    public byte getBillable() {
        return billable;
    }

    public void setBillable(byte billable) {
        this.billable = billable;
    }

    @Column(name = "billable_since")
    public Date getBillableSince() {
        return billableSince;
    }

    public void setBillableSince(Date billableSince) {
        this.billableSince = billableSince;
    }

    @Column(name = "cur_prj_role")
    public String getCurPrjRole() {
        return curPrjRole;
    }

    public void setCurPrjRole(String curPrjRole) {
        this.curPrjRole = curPrjRole;
    }

    @Column(name = "when_appointed_role")
    public Date getWhenAppointedRole() {
        return whenAppointedRole;
    }

    public void setWhenAppointedRole(Date whenAppointedRole) {
        this.whenAppointedRole = whenAppointedRole;
    }

    @Column(name = "team_lead")
    public String getTeamLead() {
        return teamLead;
    }

    public void setTeamLead(String teamLead) {
        this.teamLead = teamLead;
    }

    @Column(name = "prj_manager")
    public String getPrjManager() {
        return prjManager;
    }

    public void setPrjManager(String prjManager) {
        this.prjManager = prjManager;
    }

    @Column(name = "tutor_id")
    public int getTutorId() {
        return tutorId;
    }

    public void setTutorId(int tutorId) {
        this.tutorId = tutorId;
    }

    @Column(name = "current_techs")
    public String getCurrentTechs() {
        return currentTechs;
    }

    public void setCurrentTechs(String currentTechs) {
        this.currentTechs = currentTechs;
    }

    @Column(name = "future_techs")
    public String getFutureTechs() {
        return futureTechs;
    }

    public void setFutureTechs(String futureTechs) {
        this.futureTechs = futureTechs;
    }

    @Column(name = "wanna_change_prj")
    public byte getWannaChangePrj() {
        return wannaChangePrj;
    }

    public void setWannaChangePrj(byte wannaChangePrj) {
        this.wannaChangePrj = wannaChangePrj;
    }

    @Column(name = "en_level")
    public String getEnLevel() {
        return enLevel;
    }

    public void setEnLevel(String enLevel) {
        this.enLevel = enLevel;
    }

    @Column(name = "en_courses")
    public String getEnCourses() {
        return enCourses;
    }

    public void setEnCourses(String enCourses) {
        this.enCourses = enCourses;
    }


}
