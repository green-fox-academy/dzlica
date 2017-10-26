package com.greenfox.colors;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyColorConfig {

    @Bean
    public MyColor redcolor() {
        return new RedColor();
    }



}
