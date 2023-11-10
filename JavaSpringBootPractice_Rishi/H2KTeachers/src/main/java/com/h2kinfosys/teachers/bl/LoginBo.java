package com.h2kinfosys.teachers.bl;

import com.h2kinfosys.teachers.dto.User;

public class LoginBo {
	
	
	public User executeAuth(User user) {
		
		if(user.getPassword().equalsIgnoreCase(user.getUserId()+"@123")) {
			user.setAuthenticated(true);
			user.setMessage("User Logged In");
		}else {
			user.setAuthenticated(false);
			user.setMessage("Password is not Correct");
		}
		
		return user;
	}

}
