package com.exadel.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "role")
public class Role {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(mappedBy = "role",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    List<User> users;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setRole(String name) {
        this.name = name;
    }

}
