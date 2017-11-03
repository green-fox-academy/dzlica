package com.example.dzlica.firstmysql.model;

import javax.persistence.*;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;

    String title;
    boolean urgent;
    boolean done;

    @ManyToOne
    @JoinColumn(name = "assignee_id")
    Assignee assignee;

    public Todo(String s, boolean u, boolean d) {
        this.title = s;
        this.urgent = u;
        this.done = d;
    }

    public Todo() {

    }

    public Todo(long id, String title, boolean isUrgent, boolean isDone) {
        this.id = id;
        this.title = title;
        this.urgent = urgent;
        this.done = done;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return title;
    }

    public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }

}
