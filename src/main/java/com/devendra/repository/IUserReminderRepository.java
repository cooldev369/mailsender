package com.devendra.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.devendra.entity.UserReminder;

@Repository
public interface IUserReminderRepository extends JpaRepository<UserReminder, Long> {
	List<UserReminder> findAll();
}
