package com.sample.swimming.pool.reservation.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="AvailableSchedule")
public class Schedule {

	private String date;
	private String StartTime;
	private String duration;
	private String capacity;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStartTime() {
		return StartTime;
	}
	public void setStartTime(String startTime) {
		StartTime = startTime;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	
	
	
}
