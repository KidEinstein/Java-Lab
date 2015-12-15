

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddStudent
 */
@WebServlet("/AddStudent")
public class AddStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/";
	String dbName = "javalab";
	String user = "root";
	String password = "";
	Connection conn;
	PreparedStatement stmt;
    /**
     * @see HttpServlet#HttpServlet()
     */

    public AddStudent() {
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
    		stmt = conn.prepareStatement("insert into student_admission values(?, ?, ?, ?)");
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		String name = request.getParameter("name");
		String usn = request.getParameter("usn");
		String branch = request.getParameter("branch");
		String exam = request.getParameter("exam");
		try {
			stmt.setString(1, name);
			stmt.setString(2, usn);
			stmt.setString(3, branch);
			stmt.setString(4, exam);
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.write("Database Updated");
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
