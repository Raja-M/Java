package com.h2kinfosys.spring;

public class Greetings {
	
	private String language;
	private String state;
	
	public Greetings(String language, String state) {
		this.language = language;
		this.state = state;
	}
	public void start() {
		System.out.println("Making sure Greetings exists in registry");
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void destroy() {
		System.out.println("Making sure Greetings is destroyed");
	}
	

}
