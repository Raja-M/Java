package com.h2kinfosys.simpletest.bean;

import org.springframework.stereotype.Component;

@Component
public class User {
	
	private String userName;
	
	public User() {
		
		System.out.println("User Created");
		this.setUserName("testname");
		
		
	}

	public String getUserName() {
		
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	

}
