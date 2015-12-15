

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

@WebServlet("/FacultySubjects")
public class FacultySubjects extends HttpServlet {
	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/";
	private String dbName = "javalab";
	private String user = "root";
	private String password = "m1y3s5q7l9";
	private Statement stmt;
	private Connection conn;
    @Override
    public void init() throws ServletException {
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	PrintWriter pw = response.getWriter();
		try {
			ResultSet rs = stmt.executeQuery("select * from faculty_subject");
			while(rs.next()) {
				pw.println(rs.getString(1) + rs.getString(2) + rs.getString(3));
			}
			pw.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
