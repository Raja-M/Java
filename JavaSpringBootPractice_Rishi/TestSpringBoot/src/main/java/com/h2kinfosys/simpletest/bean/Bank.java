package com.h2kinfosys.simpletest.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bank {
	@Autowired
	private User user;
	
	
	public Bank() {
		
		System.out.println("Bank Account is created");
	}


	public User getUser() {
		System.out.println("Bank ::" +user.getUserName());
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
    
	
}
