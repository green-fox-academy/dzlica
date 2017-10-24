package com.greenfox.dzlica.materialreview;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    long id;
    String content;


    public Greeting(long id, String content, String name) {
        this.id = id;
        this.content = content + name;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
