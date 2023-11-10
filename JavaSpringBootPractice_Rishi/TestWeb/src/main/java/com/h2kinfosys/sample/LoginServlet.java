package com.h2kinfosys.sample;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	@Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
		String userId = req.getParameter("userId");
		String password = req.getParameter("password");
		PrintWriter out = resp.getWriter();
		
		Enumeration<String> headerNames = req.getHeaderNames();
		String headerName = null;
		while(headerNames.hasMoreElements()) {
			headerName = headerNames.nextElement();
			out.println("<p> + headerName::"+ headerName +" "+"Header Value is::"+ req.getHeader(headerName)+"<p> <h3>");
		}
		 out.println("<p> <h3> + User ID recieved::"+ userId +"<p> <h3>");
		 out.println("<p> <h3> + pasword recieved::"+ password +"<p> <h3>");
		 
		 Cookie user = new Cookie("userId", userId);
		 Cookie pass = new Cookie("passWord", password);
		 resp.addCookie(user);
		 resp.addCookie(pass);
		 
		 if(userId.equalsIgnoreCase(password)) {
			 out.println("correct user");
			 resp.sendRedirect("teacher.html");
			 return;
		 }else {
			 resp.sendRedirect("login.html");
		 }
	}

}
