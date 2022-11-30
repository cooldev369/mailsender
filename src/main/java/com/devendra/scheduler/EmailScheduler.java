package com.devendra.scheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.devendra.entity.UserReminder;
import com.devendra.repository.IUserReminderRepository;

@Component
public class EmailScheduler {
	
	@Autowired
	IUserReminderRepository userReminderRepository;

	@Scheduled(cron = "0 34 22 * * ?") // Every day 6 am 
	public void sendEmailCronJob() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Date now = new Date();
		String strDate = sdf.format(now);
		 /* 
		 *  Business logic to trigger email
		 */
		 for (UserReminder userRmdr : userReminderRepository.findAll()) {
	        System.out.println(userRmdr.toString());
	      }
	}
}
