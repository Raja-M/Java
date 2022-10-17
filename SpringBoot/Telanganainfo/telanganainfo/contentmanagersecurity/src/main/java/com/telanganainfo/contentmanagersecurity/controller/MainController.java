package com.telanganainfo.contentmanagersecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telanganainfo.contentmanagersecurity.entity.TinfoUserContact;
import com.telanganainfo.contentmanagersharedlib.CommonUtil;


@RestController
public class MainController {
	
	@GetMapping("/home")
	public String visitHomePage() {
		CommonUtil commonUtil = new CommonUtil();
		String welcomeMsg = commonUtil.getWelcomMsg();	
		
		return welcomeMsg;	
	}

}
