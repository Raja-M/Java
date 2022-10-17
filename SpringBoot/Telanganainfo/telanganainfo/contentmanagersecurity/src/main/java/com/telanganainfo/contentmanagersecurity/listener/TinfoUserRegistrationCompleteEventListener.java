package com.telanganainfo.contentmanagersecurity.listener;

import java.util.UUID;
import java.util.logging.LogManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.telanganainfo.contentmanagersecurity.entity.TinfoUser;
import com.telanganainfo.contentmanagersecurity.event.TinfoUserRegistrationCompleteEvent;
import com.telanganainfo.contentmanagersecurity.service.TinfoUserService;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

 

@Component
@Slf4j
public class TinfoUserRegistrationCompleteEventListener implements
		ApplicationListener<TinfoUserRegistrationCompleteEvent>{
	
	public static Logger log = LoggerFactory.getLogger(TinfoUserRegistrationCompleteEventListener.class );
	@Autowired
	private TinfoUserService tinfouserservice;

	@Override
	public void onApplicationEvent(TinfoUserRegistrationCompleteEvent event) {
		// TODO Auto-generated method stub
		
		TinfoUser user = event.getUser();
		
		String token = UUID.randomUUID().toString();
		
		// Send email
		tinfouserservice.saveTinfoUserVerificationTokenForUser( token , user);
		
		String url = event.getApplicationurl()
					 + "/tinfouserverifytoken?token="
					 + token;	
		
		System.out.println( "Click the link to verify your account : " + url);
		log.info( "Click the link to verify your account: { }" , url);
		
	}

}
