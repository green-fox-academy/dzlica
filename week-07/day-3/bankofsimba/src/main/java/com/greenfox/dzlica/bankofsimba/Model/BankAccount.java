package com.greenfox.dzlica.bankofsimba.Model;

import java.text.DecimalFormat;

public class BankAccount {
    public String name;
    public int balance;
    public String animalType;
    public String currency;


    public BankAccount(String name, int balance, String animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.currency = "Zebra";
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getName() {
        return name;
    }


    public String getAnimalType() {
        return animalType;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
}
