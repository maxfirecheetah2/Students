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
@Table(name = "skill")
public class Skill implements Serializable{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

}
