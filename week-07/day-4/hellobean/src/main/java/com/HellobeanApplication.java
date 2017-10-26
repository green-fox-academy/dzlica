package com;

import com.example.dzlica.hellobean.HelloWorld;
import com.example.dzlica.hellobean.HelloWorldConfig;
import com.greenfox.colors.MyColor;
import com.greenfox.colors.MyColorConfig;
import com.greenfox.colors.RedColor;
import javafx.print.PrintColor;
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

    @Autowired
    MyColor redcolor;

	public static void main(String[] args) {
		SpringApplication.run(HellobeanApplication.class, args);
	}

	@Override
    public void run(String... args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        helloWorld.setMessage("Hello World!");
        helloWorld.getMessage();
        ApplicationContext szinek = new AnnotationConfigApplicationContext(MyColorConfig.class);
        redcolor = szinek.getBean(RedColor.class);
        redcolor.printColor();
    }
}
