package com.h2kinfosys.sample;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AttrServlet extends HttpServlet {
    
	@Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setAttribute("ReqAttrName", "ReqAttrValue");;
     
		System.out.println("This Seems to be working I am Hitting this method");
		
		HttpSession session = req.getSession();
		
		session.setAttribute("SessionAttrName", "SessionAttrValue");
		
		ServletContext application = getServletContext();
		
		application.setAttribute("ApplicationAttrName", "ApplicationAttrValue");		
		
		RequestDispatcher rd = req.getRequestDispatcher("simple");
		rd.forward(req, resp);
	}
}
