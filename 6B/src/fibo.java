

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class fibo
 */
@WebServlet("/fibo")
public class fibo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public fibo() {
        // TODO Auto-generated constructor stub
    	 }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(request.getParameter("number"));
		int[] fibo =  new int[10];
		PrintWriter pw = response.getWriter();
		for( int i = 0; i < n; i++) {
			if (i==0)
				fibo[i]=i;
			else if(i==1)
				fibo[i]=i;
			else
				fibo[i]= fibo[i-1] + fibo[i-2];
		}
		for(int i = 0; i < n; i++) {
			pw.println(fibo[i]);
			}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
