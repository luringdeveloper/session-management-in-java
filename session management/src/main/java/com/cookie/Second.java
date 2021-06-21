package com.cookie;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/second")
public class Second extends HttpServlet{
 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req,resp);
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req,resp);
	}


	private void process(HttpServletRequest req, HttpServletResponse resp) {
		Cookie cookie[]=req.getCookies();
		
		for (Cookie cookie2 : cookie) {
			System.out.println(cookie2.getValue());
		}
		cookie[0].setValue(null);
		cookie[1].setValue(null);
		
	}
}
