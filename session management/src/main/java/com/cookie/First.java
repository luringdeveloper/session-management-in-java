package com.cookie;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/first")
public class First extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req,resp);
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req,resp);
	}


	private void process(HttpServletRequest req, HttpServletResponse resp) {
		
		String username=req.getParameter("name");
		String userpassword=req.getParameter("password");
		
		Cookie nameCookie=new Cookie("name", username);
		Cookie passwordCookie=new Cookie("password", userpassword);
		
		nameCookie.setMaxAge(0);
		passwordCookie.setMaxAge(0);
		
		resp.addCookie(nameCookie);
		resp.addCookie(passwordCookie);
		
	}
}
