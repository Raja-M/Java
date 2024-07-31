package com.h2kinfosys.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@Autowired
	private User user;
	
	public LoginController() {
		
	}
	
	@GetMapping(path="/")
	public String getLogin() {
		System.out.println("This is Just for Test");
		return "login";
	}

	@GetMapping(path="/userid")
	public String getLogin(String userId) {
		System.out.println("This is Just for Test" +userId);
		return "index";
	}
	
	@PostMapping(path = "/login")
	public ModelAndView getLogin(User user) {
		ModelAndView mv = new ModelAndView();
		System.out.println("This is user login page" +user);
		mv.addObject("user", user);
		mv.setViewName("teacher");
		return mv;
	}

}
