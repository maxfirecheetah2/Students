package com.exadel.entity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;


@Entity
@Table(name = "tutor")
public class Tutor extends User {

    @OneToMany
    private List <Feedback> feedback;



}
