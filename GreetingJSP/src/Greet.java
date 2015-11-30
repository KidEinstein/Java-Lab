import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Greet")
public class Greet extends HttpServlet{

	@Override
	public void init() throws ServletException {

	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		ServletOutputStream servletOutputStream = resp.getOutputStream();
		PrintWriter pw = new PrintWriter(servletOutputStream);
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		String gender = req.getParameter("gender");
		String message = null;
		if (age > 60) {
			message = "Namaste";
			if (gender == "male") {
				message += " uncle ";
			}
			else {
				message += " aunty ";
			}
			message += name;
		}
		else {
			message = "Hi! " + name + ". How are you?"; 
		}
		pw.write(message);
		pw.close();
	}

}
