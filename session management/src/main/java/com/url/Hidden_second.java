package com.url;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/url2")
public class Hidden_second extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req,resp);
	}
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req,resp);	
		}
	private void process(HttpServletRequest req, HttpServletResponse resp) {
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		System.out.println(name);
		System.out.println(password);
		
	}
}
