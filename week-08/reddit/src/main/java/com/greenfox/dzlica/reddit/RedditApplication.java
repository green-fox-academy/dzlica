package com.greenfox.dzlica.reddit;

import com.greenfox.dzlica.reddit.model.Reddit;
import com.greenfox.dzlica.reddit.repositories.RedditRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RedditApplication.class, args);
	}

	@Autowired
    RedditRepo redditRepo;

	@Override
	public void run(String... args) throws Exception {
	    redditRepo.save(new Reddit("firstpost", 1));
	    redditRepo.save(new Reddit("secondpost", 3));
	}
}
