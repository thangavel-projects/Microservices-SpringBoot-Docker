package com.sample.swimming.pool.notification.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "NotificationDetails")
public class Notification implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private long id;
	
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
