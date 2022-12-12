package com.devendra.scheduler;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import com.devendra.entity.UserReminder;
import com.devendra.repository.IUserReminderRepository;
import com.devendra.service.IEmailService;

@Component
public class EmailScheduler {

	@Autowired
	IUserReminderRepository userReminderRepository;
	
	@Autowired
	IEmailService emailService;

	@Scheduled(cron = "0 25 22 * * ?") // Every day 6 am
	public void sendEmailCronJob() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date now = new Date();
		String strDate = sdf.format(now);
		List<UserReminder> userRmdrList = userReminderRepository.findAll();
		for (UserReminder userRmdr : userRmdrList) {		
			Date expiryDate = userRmdr.getExpiryDate();
			int n = userRmdr.getDaysBefore();
			Calendar cal = Calendar.getInstance();
			cal.setTime(expiryDate);
			cal.add(Calendar.DAY_OF_MONTH, -n);
			Date reminderDate = cal.getTime();
			if(strDate.equalsIgnoreCase(sdf.format(reminderDate)))
				emailService.sendReminderMail(userRmdr);
		}
	}
}
