import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentInformation {
	static Scanner in = new Scanner(System.in);
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/";
	String dbName = "javalab";
	String user = "root";
	String password = "m1y3s5q7l9";
	Connection conn;
	
	public StudentInformation() {
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
	
	public void display() {
		String query = "select * from student";
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.println("USN: " + rs.getString(1) + " Name: " + rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insert() {
		try {
			PreparedStatement ps = conn.prepareStatement("insert into student values (?,?)");
			System.out.println("Enter roll no");
			int rollNo = in.nextInt();
			System.out.println("Enter name");
			String name = in.next();
			ps.setInt(1, rollNo);
			ps.setString(2, name);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		StudentInformation si = new StudentInformation();
		while (true) {
			System.out.println("Enter 1 for display, 2 for insert");
			int choice = in.nextInt();
			if (choice == 1) si.display();
			else if (choice == 2) si.insert();
		} 
	}

}
