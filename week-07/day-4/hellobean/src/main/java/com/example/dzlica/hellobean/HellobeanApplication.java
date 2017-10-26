package com.example.dzlica.hellobean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class HellobeanApplication implements CommandLineRunner {

    @Autowired
    HelloWorld helloWorld;

	public static void main(String[] args) {
		SpringApplication.run(HellobeanApplication.class, args);
	}

	@Override
    public void run(String... args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        helloWorld.setMessage("Hello World!");
        helloWorld.getMessage();
    }
}
