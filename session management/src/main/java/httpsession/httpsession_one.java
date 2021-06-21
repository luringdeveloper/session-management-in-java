package httpsession;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/httpsession")
public class httpsession_one extends HttpServlet {

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
		HttpSession httpSession= req.getSession();
		httpSession.setAttribute("password", password);
		httpSession.setAttribute("name", name);
		
		//httpSession.isnew()
		//httpSession.getId();
		//httpSession.setMaxInactiveInterval(10);
		//httpSession.getMaxInactiveInterval();
		//httpSession.removeAttribute("name");
		//httpSession.invalidate();
		
	}
}
