import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MarkSheet {
	static Scanner in = new Scanner(System.in);
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/";
	String dbName = "javalab";
	String user = "root";
	String password = "m1y3s5q7l9";
	Connection conn;
	
	public MarkSheet() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(url + dbName, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void displayMarksSheet() {
		String query = "select * from student_mark_sheet";
		try {
			Statement stmt  = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			PreparedStatement ps = conn.prepareStatement("select * from student_mark_sheet_subjects where usn = ?");
			while (rs.next()) {
				String usn = rs.getString(1);
				System.out.println("USN :" + usn + " Name : " + rs.getString(2));
				ps.setString(1, usn);
				ResultSet rs2 = ps.executeQuery();
				while (rs2.next()) {
					String subjectCode = rs2.getString(1);
					int cie = rs2.getInt(2);
					int see = rs2.getInt(3);
					int total  = cie + see;
					System.out.println("Subject Code: " + subjectCode + " CIE: " + cie + " SEE: " + see + " Total: " + total);
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		MarkSheet ms = new MarkSheet();
		ms.displayMarksSheet();
	}

}
