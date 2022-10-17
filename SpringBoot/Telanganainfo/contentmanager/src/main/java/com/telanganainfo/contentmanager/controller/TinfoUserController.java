package com.telanganainfo.contentmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
