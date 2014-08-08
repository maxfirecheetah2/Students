package com.exadel.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
/**
 * Created with IntelliJ IDEA.
 * User: X
 * Date: 18.07.14
 * Time: 16:19
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table(name = "interviewer")
public class Interviewer {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "gen")
    @GenericGenerator(name = "gen", strategy = "foreign",parameters = @org.hibernate.annotations.Parameter(name = "property", value = "user"))
    private int id;

    @ManyToMany(mappedBy = "interviewers")
     private List<Interview> interviews;

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    User user;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public List<Interview> getInterviews() {
        return interviews;
    }

    public void setInterviews(List<Interview> interviews) {
        this.interviews = interviews;
    }
}
