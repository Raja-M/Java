package com.telanganainfo.contentmanagersecurity.event;

import org.springframework.context.ApplicationEvent;

import com.telanganainfo.contentmanagersecurity.entity.TinfoUser;

public class TinfoUserRegistrationCompleteEvent extends ApplicationEvent {
	
	private TinfoUser user;
	private String applicationurl;

	public TinfoUserRegistrationCompleteEvent( TinfoUser user, String applicationurl) {
		super(user);
		// TODO Auto-generated constructor stub
		
		this.user = user;
		this.applicationurl = applicationurl; 
	}

	public TinfoUser getUser() {
		return user;
	}

	public void setUser(TinfoUser user) {
		this.user = user;
	}
	
	

	public String getApplicationurl() {
		return applicationurl;
	}

	public void setApplicationurl(String applicationurl) {
		this.applicationurl = applicationurl;
	}

}
