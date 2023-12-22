package com.h2kinfosys.spring;

public class HelloWorld {
	
	private String message;

	public String getMessage() {
		System.out.println("The message is" + message);
		return message;
		
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
