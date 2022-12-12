package com.devendra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.devendra.entity.UserReminder;
import com.devendra.util.MessageUtil;

@Service
public class EmailServiceImpl implements IEmailService{
	
	@Autowired 
	private JavaMailSender javaMailSender;
	
	@Value("${spring.mail.username}") 
	private String sender;
	

	@Override
	public void sendReminderMail(UserReminder usrReminder) {
		SimpleMailMessage message = new SimpleMailMessage(); 
        message.setFrom(sender);
        message.setTo(usrReminder.getEmail()); 
        message.setSubject(MessageUtil.getSubject()); 
        message.setText(MessageUtil.getMessage(usrReminder.getDocType(), usrReminder.getExpiryDate()));
        try {
        javaMailSender.send(message);
        } catch(MailException ex) {
        	System.out.println("Exception occurred: " + ex.getLocalizedMessage());
        }
        System.out.println("Email Reminder Sent Successfully!!!");
	}

}
