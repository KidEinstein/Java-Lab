

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayStudents
 */
@WebServlet("/DisplayStudents")
public class DisplayStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/";
	String dbName = "javalab";
	String user = "root";
	String password = "";
	Connection conn;
	Statement stmt;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayStudents() {
        super();

        // TODO Auto-generated constructor stub
    }

    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	try {
    		Class.forName(driver);
    	}
    	catch (ClassNotFoundException e) {
    		e.printStackTrace();
    	}
    	try {
    		conn = DriverManager.getConnection(url + dbName, user, password);
    		stmt = conn.createStatement();
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<table>");
		pw.println("<tr><td>Name<td>USN<td>Branch<td>Exam</tr>");
		try {
			ResultSet rs = stmt.executeQuery("select * from student_admission where exam='cet' and branch='cse'");
			while (rs.next()) {
				pw.println("<tr><td>" + rs.getString(1) + "<td>" + rs.getString(2) + "<td>" + rs.getString(3) + "<td>" + rs.getString(4) + "</tr>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.println("</table>");
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
