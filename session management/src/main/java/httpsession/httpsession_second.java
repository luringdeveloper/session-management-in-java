package httpsession;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/httpsession2")
public class httpsession_second extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req,resp);
	}
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req,resp);	
		}
	private void process(HttpServletRequest req, HttpServletResponse resp) {
		
	HttpSession httpSession=req.getSession(false);
		String name= (String)httpSession.getAttribute("name");
		String password= (String)httpSession.getAttribute("password");
		System.out.println(name);
		System.out.println(password);
		
	}
}
