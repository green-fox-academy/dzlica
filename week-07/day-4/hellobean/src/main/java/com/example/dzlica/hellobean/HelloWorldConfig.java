package com.example.dzlica.hellobean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
public class HelloWorldConfig {

    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }
}
