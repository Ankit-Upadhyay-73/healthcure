package com.healthcare.model;

public class Request {

	String username;
	String contact;
	String test;
	public Request(String username, String contact, String test) {
		super();
		this.username = username;
		this.contact = contact;
		this.test = test;
	}
	
	public Request() {}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	
}
