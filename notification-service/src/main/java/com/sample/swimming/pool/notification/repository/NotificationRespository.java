package com.sample.swimming.pool.notification.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.sample.swimming.pool.notification.model.Notification;

public interface NotificationRespository extends MongoRepository<Notification, Long> {
	
	//Notification getNotificationDetails();
		
}
