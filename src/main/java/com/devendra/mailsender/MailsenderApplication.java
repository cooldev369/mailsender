package com.devendra.mailsender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = "com.devendra")
@EnableJpaRepositories(basePackages = "com.devendra.repository")
@EntityScan("com.devendra.entity")
public class MailsenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MailsenderApplication.class, args);
	}

}
