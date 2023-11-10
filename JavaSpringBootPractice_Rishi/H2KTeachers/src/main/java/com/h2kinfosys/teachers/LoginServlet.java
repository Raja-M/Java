package com.h2kinfosys.teachers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.h2kinfosys.teachers.bl.LoginBo;
import com.h2kinfosys.teachers.dto.User;

public class LoginServlet extends HttpServlet {
	
	LoginBo loginbo;
	@Override
	public void init() throws ServletException{
		System.out.println("LoginServlet::init");
		loginbo = new LoginBo();
	}
	
	@Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		User user = new User();
		user.setUserId(req.getParameter(User.USERID_KEY));
		user.setPassword(req.getParameter(User.PASSWORD_KEY));
		
		user = loginbo.executeAuth(user);
		HttpSession session = req.getSession();
		session.setAttribute("user", user);
		RequestDispatcher rd = null;
		if(user.isAuthenticated()) {
			rd =req.getRequestDispatcher("teacher.jsp");
			rd.forward(req, resp);
		}else {
			rd = req.getRequestDispatcher("index.jsp");
			rd.forward(req, resp);
		}
	}
	
	@Override
	public void destroy() {
		System.out.println("LoginServlet::Destroyed");
		
	}
	
}
