package com.exadel.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
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
@PrimaryKeyJoinColumn(name="id")
public class Interviewer extends User {

    @ManyToMany(mappedBy = "interviewers")
     private List<Interview> interviews;

    public List<Interview> getInterviews() {
        return interviews;
    }

    public void setInterviews(List<Interview> interviews) {
        this.interviews = interviews;
    }
}
