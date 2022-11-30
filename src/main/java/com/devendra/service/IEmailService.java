package com.devendra.service;

import com.devendra.entity.UserReminder;

public interface IEmailService {

	boolean sendReminderMail(UserReminder usrReminder);
}
