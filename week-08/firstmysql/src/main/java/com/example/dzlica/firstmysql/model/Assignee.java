package com.example.dzlica.firstmysql.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Assignee {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;

    @OneToMany (cascade =CascadeType.ALL, mappedBy = "assignee", orphanRemoval = true)
    List<Todo> lottodos;



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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public List<Todo> getLottodos() {
        return lottodos;
    }

    public void setLottodos(List<Todo> lottodos) {
        this.lottodos = lottodos;
    }

    @Override
    public String toString() {
        return name;
    }
}
