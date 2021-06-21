package hiden;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hidden1")
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
		
		resp.setContentType("text/html");
		resp.getWriter().print("<form action='hidden2'>");	
		resp.getWriter().print("<input type='hidden' name='name' value='"+name+"'>");
		resp.getWriter().print("<input type='submit' value='next'>");
		resp.getWriter().print("</form'>");	
		
	}
}
