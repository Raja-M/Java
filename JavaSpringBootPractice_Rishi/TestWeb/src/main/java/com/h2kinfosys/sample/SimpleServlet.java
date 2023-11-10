package com.h2kinfosys.sample;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleServlet extends HttpServlet {
	//http://localhost:8080/TestWeb/simple?param =100
	
	@Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
		System.out.println("This Seems to be working I am Hitting this method");
		PrintWriter out = resp.getWriter();
		ServletConfig config = getServletConfig();
		String dbname = config.getInitParameter("DBname");
		out.println("<p> + Config name:: dbname and config value::"+ dbname+"<p> <h3>");
		String param = req.getParameter("param");
		
		 out.println("This Seems to be working I am Hitting this method with Param"+ "::"+param);
		 
		 Cookie[] cookies = req.getCookies();
		 if(cookies!=null && cookies.length >0)
		 {
		 for(Cookie eachcookie:cookies) {
			 out.println("<p> + cookiename::"+ eachcookie.getName() +" "+"cookie value::"+ eachcookie.getValue()+"<p> <h3>"); 
		 }
		 }
		 Enumeration<String> headerNames = req.getHeaderNames();
			String headerName = null;
			while(headerNames.hasMoreElements()) {
				headerName = headerNames.nextElement();
				out.println("<p> + headerName::"+ headerName +" "+"Header Value is::"+ req.getHeader(headerName)+"<p> <h3>");
			}
			
			out.println("<p> + Request Attr Name:: ReqAttrName :: Request Attr Value"+ req.getAttribute("ReqAttrName")+"<p> ");
			out.println("<p> + Session Attr Name:: SessionAttrName :: Session Attr Value"+ req.getSession().getAttribute("SessionAttrName")+"<p> ");
			out.println("<p> + Context Attr Name:: ApplicationAttrName :: Context Attr Value"+ getServletContext().getAttribute("ApplicationAttrName")+"<p> ");
			
	}
      
	
}
