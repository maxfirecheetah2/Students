package com.exadel.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: X
 * Date: 18.07.14
 * Time: 16:26
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "mark")
public class Marks implements Serializable{

    private int id_skill;

    private int mark;

    @ManyToOne
    @JoinColumn(name="interview_id")
    private Interview interview;




}
