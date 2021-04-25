package com.spring.kafka.consumer.model;

public class Admin {
	private String name;
	private String email;
	private String address;
	
	public Admin() {
		
	}
	
	public Admin(String name, String email, String address) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		 return "Admin{" +
	                "name='" + name + '\'' +
	                ", email=" + email +
	                ", address=" + address +
	                '}';
	    }
	}
	


