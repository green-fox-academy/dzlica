package com.greenfox.dzlica.restex.Model;

public class Doubling {

    int received;
    int result;

    public Doubling() {
    }

    public Doubling(int received) {
        this.received = received;
        this.result = received * 2;
    }


    public int getReceived() {
        return received;
    }

    public void setReceived(int recived) {
        this.received = recived;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
