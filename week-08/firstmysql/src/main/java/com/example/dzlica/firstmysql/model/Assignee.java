package com.example.dzlica.firstmysql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Assignee {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    long id;

    String name;
    String email;

    public Assignee() {
    }


    public Assignee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Assignee(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return name;
    }
}
