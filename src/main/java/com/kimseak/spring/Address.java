package com.kimseak.spring;


import org.springframework.stereotype.Component;

@Component
public class Address {
	
	private String address = "Wall Street 34";
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
}
