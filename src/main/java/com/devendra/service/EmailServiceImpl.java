package com.devendra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import com.devendra.entity.UserReminder;

public class EmailServiceImpl implements IEmailService{
	
	@Autowired 
	private JavaMailSender javaMailSender;
	
	@Value("${spring.mail.username}") 
	private String sender;
	

	@Override
	public boolean sendReminderMail(UserReminder usrReminder) {
		
		return true;
	}

}
