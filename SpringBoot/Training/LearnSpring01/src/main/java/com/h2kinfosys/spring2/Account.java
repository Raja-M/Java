package com.h2kinfosys.spring2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("account")
public class Account {
	
	public Account() {
		System.out.println("Inside Account Construct");
	}
	
	@PostConstruct
	public void init() {
		
		System.out.println("Inside Account init");
		
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Inside Account destroy ");
		
	}

}
