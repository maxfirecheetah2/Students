package com.exadel.entity;


import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



@Entity
@Table(name = "user", uniqueConstraints = @UniqueConstraint(columnNames={"id", "login", "email"}))
@Inheritance(strategy=InheritanceType.JOINED)
public class User implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    @NotNull
    private int id;


    @Column(name = "login")
    @NotNull
    @Size(min = 3, max = 30)
    private String login;

    @Column(name = "password")
    @NotNull
    @Size(min = 3, max = 256)
    private String password;


    @Column(name = "name")
    @NotNull
    @Size(min = 1, max = 30)
    private String name;

    @Column(name = "surname")
    @NotNull
    @Size(min = 1, max = 30)
    private String surname;

    @Column(name = "email")
    @NotNull
    @Email
    private String email;

    @Column(name = "skype")
    @NotNull
    private String skype;

    @Column(name = "phone")
    @NotNull
    private String phone;

    @Column(name="image")
    private String image;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "user_role")
    private List<Role> roles;

    public User(){
        roles = new ArrayList<Role>();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
