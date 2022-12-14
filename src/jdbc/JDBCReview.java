package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;

public class JDBCReview {//This is the example for deleting particular row or rows at once since "where" clause is used in the sql query...

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cohart20_review", "root", "root");
		
		PreparedStatement pstmt = conn.prepareStatement("select * from candidate");
		
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));	
			
		}
		
		
	}
}

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//
//import com.mysql.cj.protocol.Resultset;
//
//public class JDBCReview {//This is the example for deleting particular row or rows at once since "where" clause is used in the sql query...
//
//	public static void main(String[] args) throws Exception {
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cohart20_review", "root", "root");
//		
//		PreparedStatement pstmt = conn.prepareStatement("select * from candidate");
//		
//		ResultSet rs = pstmt.executeQuery();
//		
//		rs.next();
//		
//		System.out.println(rs.getInt(1));
//		System.out.println(rs.getString(2));
//		System.out.println(rs.getString(3));
//		
//		rs.next();
//		
//		System.out.println(rs.getInt(1));
//		System.out.println(rs.getString(2));
//		System.out.println(rs.getString(3));
//		
//		rs.next();
//		
//		System.out.println(rs.getInt(1));
//		System.out.println(rs.getString(2));
//		System.out.println(rs.getString(3));
//	}
//}


//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.Statement;
//import java.util.Scanner;
//
//public class JDBCReview {//This is the example for deleting particular row or rows at once since "where" clause is used in the sql query...
//
//	public static void main(String[] args) throws Exception {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the name to delete record/s");
//		
//		String enteredName = sc.next();
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cohart20_review", "root", "root");
//		
//		PreparedStatement pstmt = conn.prepareStatement("delete from candidate where name = ?");
//		
//		pstmt.setString(1, enteredName);
//		
//		pstmt.execute();
//		
//	}
//}


//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//
//public class JDBCReview {//This is the example for deleting all the rows since I did not specify any particular row with "where" clause... 
//
//	public static void main(String[] args) throws Exception {
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cohart20_review", "root", "root");
//		
//		PreparedStatement pstmt = conn.prepareStatement("delete from candidate");
//		
//		pstmt.execute();	
//	}
//}

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.Statement;
//import java.util.Scanner;
//
//public class JDBCReview {//This is the example for updating record or row after taking inputs from the user on runtime...
//
//	public static void main(String[] args) throws Exception {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter your Candidate-Id if yow wish to update the email address!!");
//		
//		int cid = sc.nextInt();
//		
//		System.out.println("Enter your Email Address!!");
//		
//		String email = sc.next();
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cohart20_review", "root", "root");
//		
//		PreparedStatement pstmt = conn.prepareStatement("update candidate set email = ? where c_id = ?");
//		
//		System.out.println(pstmt.toString());
//		
//		pstmt.setString(1, email);
//		pstmt.setInt(2, cid);
//		
//		pstmt.execute();
//		
//	}
//}




//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.Statement;
//import java.util.Scanner;
//
//public class JDBCReview {//This is the example for inserting record or row after taking inputs from the user on runtime...
//
//	public static void main(String[] args) throws Exception {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter your Candidate-Id!!");
//		
//		int cid = sc.nextInt();
//		
//		System.out.println("Enter your Name!!");
//		
//		String name = sc.next();
//		
//		System.out.println("Enter your Email Address!!");
//		
//		String email = sc.next();
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cohart20_review", "root", "root");
//		
//		PreparedStatement pstmt = conn.prepareStatement("insert into candidate values (?, ?, ?)");
//		
//		pstmt.setInt(1, cid);
//		pstmt.setString(2, name);
//		pstmt.setString(3, email);
//		
//		pstmt.execute();
//		
//	}
//}


//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.Statement;
//import java.util.Scanner;
//
//public class JDBCReview {//This is the example for inserting record or row after taking inputs from the user on runtime...
//
//	public static void main(String[] args) throws Exception {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter your Candidate-Id!!");
//		
//		int cid = sc.nextInt();
//		
//		System.out.println("Enter your Name!!");
//		
//		String name = sc.next();
//		
//		System.out.println("Enter your Email Address!!");
//		
//		String email = sc.next();
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cohart20_review", "root", "root");
//		
//		PreparedStatement pstmt = conn.prepareStatement("insert into candidate values (?, ?, ?)");
//		
//		pstmt.setInt(1, cid);
//		pstmt.setString(2, name);
//		pstmt.setString(3, email);
//		
//		pstmt.execute();
//		
//	}
//}









//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
//
//public class JDBCReview {//This is the example for inserting record or row with hard-coded values...
//
//	public static void main(String[] args) throws Exception {
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cohart20_review", "root", "root");
//		
//		Statement stmt = conn.createStatement();
//		
//		stmt.executeUpdate("insert into candidate values(101, 'Judith', 'jud@gmail.com')");
//	}
//}




//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
//
//public class JDBCReview {//This program is creating table from the Java code...
//
//	public static void main(String[] args) throws Exception {
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cohart20_review", "root", "root");
//		
//		Statement stmt = conn.createStatement();
//		
//		stmt.executeUpdate("create table candidate(c_id int primary key, name varchar(30), email varchar(30))");
////		executeUpdate() is used to mention the sql query and this method is used to either create table, update table, delete table
////		or insert into table...
//	}
//
//}




