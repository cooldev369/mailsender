package com.devendra.mailsender;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MailsenderApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MailsenderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello this is a standalone Springboot application!!!");
		// connect to database
		
		// Read from database
		
		// Display results from database
		
		// Business logic to trigger email
		
		// This program should run every night at 10 pm
		
	}

}
