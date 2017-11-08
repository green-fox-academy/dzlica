package com.greenfox.dzlica.restex.controllers;

public class Hiba {

    String error;

    public Hiba() {
    }

    public Hiba(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
