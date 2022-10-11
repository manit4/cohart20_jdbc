

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_First {
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cohart20", "root", "root");
		
		Statement stmt = conn.createStatement();
		
		stmt.executeUpdate("insert into candidate values(100, 'Falguni', 'Patel', 'falguni@gmail.com')");
	}

}

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
//
//public class JDBC_First {
//	
//	public static void main(String[] args) throws Exception {
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");//This statement is used to load the driver class on runtime which will help java program
//													//to have connection established.. 
//		
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cohart20", "root", "root");//DriverManager is an class/interface
//									//which is used to create connection with the database. DriverManager' getConnection() method takes
//									//3 String arguments. One String argument takes the IP address of the machine on which you have installed
//									//the MySQL and the IP is given as "localhost" that means MYSQL is installed on the same machine from which 
//									//you are trying to create connection or you can give "127.0.0.1" since 127.0.0.1 is as same as
//									//localhost...
//		
//		Statement stmt = conn.createStatement();
//		
//		stmt.execute("create table candidate(c_id int, first_name varchar(20), last_name varchar(20), email varchar(20))");
//	}
//
//}


//import java.util.Scanner;
//
//public class JDBC_First {//This program creates 3 variables (int i, j and result) in the memory for the program to execute successfully
//						//however, those variables stay or exist in the memory as long as the program is in execution mode. The moment
//						//our program is terminated successfully, all the variables will be gone forever from the memory. That means,
//						//variables used in the program are temporary. In case, you wish to hold data for later use, you should use some
//						//database which is any relational database such as Oracle, MySql etc... 
//	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter your First Number!!");
//		
//		int firstNumber = sc.nextInt();
//		
//		System.out.println("Enter your Second Number!!");
//		
//		int secondNumber = sc.nextInt();
//		
//		int result = firstNumber + secondNumber;
//		
//		System.out.println("The Result is "+result);
//	}
//
//}


//public class JDBC_First {
//	
//	public static void main(String[] args) {
//		
//		int i = 4;
//		
//		int j = 5;
//		
//		int result = i + j;
//		
//		System.out.println("The Result is "+result);
//	}
//
//}
