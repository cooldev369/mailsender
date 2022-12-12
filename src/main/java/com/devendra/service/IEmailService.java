package com.devendra.service;

import com.devendra.entity.UserReminder;

public interface IEmailService {

	void sendReminderMail(UserReminder usrReminder);
}
