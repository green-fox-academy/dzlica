package com.greenfox.dzlica.restex.Model;

public class AppendA {

    String appended;

    public AppendA(String appendable) {
        this.appended = appendable + "a";
    }

    public String getAppended() {
        return appended;
    }

    public void setAppended(String appended) {
        this.appended = appended;
    }
}
