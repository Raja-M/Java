package com.telanganainfo.contentmanagerresourceserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TinfoUserController {
	
	@GetMapping("/api/users")
	public String[] getUser() {
		return new String[] {"Austin","Mark","Geven"};
	}

}
