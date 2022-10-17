package com.telanganainfo.contentmanagersecurity.controller;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.telanganainfo.contentmanagersecurity.entity.TinfoUserPasswordModel;
import com.telanganainfo.contentmanagersecurity.entity.TinfoUser;
import com.telanganainfo.contentmanagersecurity.entity.TinfoUserVerificationToken;
import com.telanganainfo.contentmanagersecurity.event.TinfoUserRegistrationCompleteEvent;
import com.telanganainfo.contentmanagersecurity.model.TinfoUserModel;
import com.telanganainfo.contentmanagersecurity.service.TinfoUserService;

@RestController
public class TinfoUserController {
	
	@Autowired
	private TinfoUserService tinfouserservice;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@PostMapping("/tinfouserregister")
	public TinfoUser registerUser(@RequestBody TinfoUserModel userModel, final HttpServletRequest request) {				
		
//			return userModel ;
		 	
		  TinfoUser user = tinfouserservice.registerUser(userModel);
		  publisher.publishEvent( new TinfoUserRegistrationCompleteEvent
				  		(user, applicationUrl(request)));
		  return user;		 
	}
	
	@PostMapping("/tinfouserresetpassword")
	public String resetPassword(@RequestBody TinfoUserPasswordModel passwordModel, HttpServletRequest request ) {
			
		 TinfoUser user = tinfouserservice.findByUseremail( passwordModel.getUseremail());
		 
		 String url = "";
		 
		 if( user != null ) {
			 String token = UUID.randomUUID().toString();
			 tinfouserservice.createPasswordRestTokenForUser(user, token);
			 url = passwordResetTokenMail( user, applicationUrl( request), token);
			 
		 }
		 return url;
		 
	}
	
	
	private String passwordResetTokenMail(TinfoUser tinfoUser, String applicationUrl,String token) {
		// TODO Auto-generated method stub
		String url = applicationUrl
				 + "/tinfosavepassword?token="
				 + token;
		
		System.out.println( "Click the link to reset your password : " + url);

		return url;
	}

	@GetMapping("/tinfouserverifytoken")
	public String tinfouserverify( @RequestParam ("token") String token) {
		 
		String result = tinfouserservice.validateVerificationToken(token);
		if( result.equalsIgnoreCase( "valid")) {
				return "User Verified Successfully";
		}		
		return "Bad User";
	}
	
	@GetMapping("/tinfouseresendtoken")
	public String tinfouserresend( @RequestParam ("token") String token,
									HttpServletRequest request) {
		 
		TinfoUserVerificationToken tinfoUserVerificationToken 
					= tinfouserservice.resendVerificationToken(token);
		TinfoUser tinfoUser = tinfoUserVerificationToken.getUser();
		resendVerificationTokenMail( tinfoUser , applicationUrl(request), tinfoUserVerificationToken);
			
		return "Verification Link Sent";
	}
	
	
	private void resendVerificationTokenMail(TinfoUser tinfoUser, String applicationUrl,TinfoUserVerificationToken tinfoUserVerificationToken) {
		// TODO Auto-generated method stub
		String url = applicationUrl
				 + "/tinfouserverify?token="
				 + tinfoUserVerificationToken.getUserToken();
		
		System.out.println( "Click the link to verify your account : " + url);
					
		
	}


	private String applicationUrl(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return "http://" +
				request.getServerName() +
				":" + 
				request.getServerPort() +
				request.getContextPath();				
	}


	@GetMapping("/tinfouser")
	public List<TinfoUser> getTinfoUser( ) {
		
		return tinfouserservice.fetchTinfoUserList( ); 
	}
	
	
	@GetMapping("/tinfouser/{id}")
	public TinfoUser getTinfoUserById(@PathVariable("id") Long userid) {
		
		return   tinfouserservice.fetchTinfoUserById( userid ); 
	}
	@GetMapping("/tinfouser/userfirstname/{userfirstname}")
	public TinfoUser getTinfoUserByUserfirstname(@PathVariable("userfirstname") String userfirstname) {
		
		return   tinfouserservice.fetchTinfoUserByUserfirstname(userfirstname); 
	}	

	@PostMapping("/tinfouser")
	public TinfoUser saveTinfoUser(@RequestBody TinfoUser tinfouser ) {
		
		return tinfouserservice.saveTinfoUser( tinfouser); 
	}
	
	@PutMapping("/tinfouser/{userid}")
	public TinfoUser updateTinfoUser( @PathVariable("userid") Long userid,  @RequestBody TinfoUser tinfouser ) {
		
		return tinfouserservice.updateTinfoUser(userid, tinfouser); 
	}	
	
	@DeleteMapping("/tinfouser/{id}")
	public String deleteTinfoUserById(@PathVariable("id") Long userid) {
		
		return   tinfouserservice.deleteTinfoUser( userid ); 
	}
	
}
