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
		todoRepo.save(new Todo("Make dinner", true, false));
        todoRepo.save(new Todo("Carve pumpkin", true, false));
        todoRepo.save(new Todo("Make pumpkinsoup", false, false));
        todoRepo.save(new Todo("Play lego", true, false));
        todoRepo.save(new Todo("Watch Star Trek", false, false));
        todoRepo.save(new Todo("Code", false, false));
	}
}
