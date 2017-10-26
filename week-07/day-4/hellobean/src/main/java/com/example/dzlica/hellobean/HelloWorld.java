package com.example.dzlica.hellobean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;



public class HelloWorld {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }

    public String getMessage(){
        System.out.println("Your message: " + message);
        return message;
    }

}
