package com.devendra.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usr_reminder")
public class UserReminder {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	@Column(name="email")
	String email;
	@Column(name="expiry_date")
	Date expiryDate;
	@Column(name="days_before")
	Integer days_before;

}
