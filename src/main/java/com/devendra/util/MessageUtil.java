package com.devendra.util;

import java.util.Date;

public class MessageUtil {
	
	public static String getMessage(String docType, Date expiry) {
		StringBuilder message = new StringBuilder();
		message.append("Your ");
		message.append(docType);
		message.append(" is going to expire on ");
		message.append(expiry.toString());
		message.append(".");
		return message.toString();
	}
	
	public static String getSubject() {
		StringBuilder subject = new StringBuilder();
		subject.append("Important: Document Renewal Reminder");
		return subject.toString();
	}

}
