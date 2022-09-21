package com.telanganainfo.contentmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telanganainfo.contentmanager.entity.TinfoUser;
import com.telanganainfo.contentmanager.service.TinfoUserService;

 
@RestController
public class TinfoUserController {
	
	@Autowired
	private TinfoUserService tinfouserservice;
	
	@GetMapping("/tinfouser")
	public List<TinfoUser> getTinfoUser( ) {
		
		return tinfouserservice.fetchTinfoUserList( ); 
	}

	@PostMapping("/tinfouser")
	public TinfoUser saveTinfoUser(@RequestBody TinfoUser tinfouser ) {
		
		return tinfouserservice.saveTinfoUser( tinfouser); 
	}
}
