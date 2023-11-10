package com.h2kinfosys.teachers.dto;

public class User {
	
	public User(){
		
	}
	
	private String userId;
	private String password;
	private boolean isAuthenticated;
	private String message;
	
	public static final String USERID_KEY = "userId";
	public static final String PASSWORD_KEY = "password";

	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", isAuthenticated=" + isAuthenticated
				+ ", message=" + message + "]";
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isAuthenticated() {
		return isAuthenticated;
	}
	public void setAuthenticated(boolean isAuthenticated) {
		this.isAuthenticated = isAuthenticated;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
