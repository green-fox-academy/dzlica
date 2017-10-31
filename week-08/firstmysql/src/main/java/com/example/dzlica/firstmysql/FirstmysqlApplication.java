package com.example.dzlica.firstmysql;

import com.example.dzlica.firstmysql.model.Todo;
import com.example.dzlica.firstmysql.repositories.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstmysqlApplication implements CommandLineRunner {

    @Autowired
    TodoRepo todoRepo;

	public static void main(String[] args) {
		SpringApplication.run(FirstmysqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		todoRepo.save(new Todo("I have to learn Object Relational Mapping"));
	}
}
