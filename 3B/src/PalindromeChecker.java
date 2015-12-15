

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PalindromeChecker
 */
@WebServlet("/PalindromeChecker")
public class PalindromeChecker extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public PalindromeChecker() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String number = request.getParameter("number");
		StringBuilder numberSb = new StringBuilder(number);
		StringBuilder numberReverseSb = new StringBuilder(number);
		numberReverseSb.reverse();
		PrintWriter pw = response.getWriter();
		pw.write(number);
		pw.write(numberReverseSb.toString());
		if (numberSb.toString().equals(numberReverseSb.toString())) {
			pw.println("Number is a palindrome");
		}
		else {
			pw.println("Number is not a palindrome");
		}
		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
