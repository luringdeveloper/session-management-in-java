package com.url;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/url")
public class Hidden_one extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req,resp);
	}
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req,resp);	
		}
	private void process(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String name="ajay";
		String password="1234";
		resp.getWriter().print("<a href='url2?name="+name+"&password="+password+"'>go</a>");
		
		
	}
}
