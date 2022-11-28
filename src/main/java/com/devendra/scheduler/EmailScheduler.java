package com.devendra.scheduler;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class EmailScheduler {

	@Scheduled(cron = "0 0 6 * * ?") // Every day 6 am 
	public void sendEmailCronJob() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Date now = new Date();
		String strDate = sdf.format(now);
		System.out.println("Java cron job expression:: " + strDate);
		
		 /* Connect to database
		 * 
		 *  Read from database
		 * 
		 *  Display results from database
		 * 
		 *  Business logic to trigger email */
	}
}
