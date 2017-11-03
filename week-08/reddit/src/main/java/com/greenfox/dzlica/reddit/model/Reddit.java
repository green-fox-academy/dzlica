package com.greenfox.dzlica.reddit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reddit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String title;
    int score;

    public Reddit(String title, int score) {
        this.title = title;
        this.score = score;
    }

    public Reddit(long id, String title, int score) {
        this.id = id;
        this.title = title;
        this.score = score;
    }

    public Reddit() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
