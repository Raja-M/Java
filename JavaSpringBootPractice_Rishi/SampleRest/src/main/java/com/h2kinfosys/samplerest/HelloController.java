package com.h2kinfosys.samplerest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	User user;
	public HelloController() {
		
	}
    
	@GetMapping(path="/{name}")
	public User getMessage(@PathVariable String name) {	
		user = new User();
		user.setName(name);
		user.setMessage("This is sample Rest Test");
		
		return user;
		
	}
}
