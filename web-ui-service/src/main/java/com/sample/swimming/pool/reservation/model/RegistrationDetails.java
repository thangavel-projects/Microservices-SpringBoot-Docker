package com.sample.swimming.pool.reservation.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ReservationDetails")
public class RegistrationDetails {

	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private String date;
	private String time;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLasttName(String lasttName) {
		this.lastName = lasttName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	
}
