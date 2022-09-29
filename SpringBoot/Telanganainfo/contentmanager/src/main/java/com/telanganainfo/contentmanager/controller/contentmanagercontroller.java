package com.telanganainfo.contentmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class contentmanagercontroller {
	
	@GetMapping( "/")
	public String content() {
		return "Welcome to Telanganainfo.com!!";
	}
	@GetMapping( "/news")
	public String news() {
		return "Welcome to Telanganainfo.com website!";
	}

}
