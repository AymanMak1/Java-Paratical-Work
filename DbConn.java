import java.sql.Connection;
import java.sql.*;

public class DbConn {
	String url= "";
	static Connection conn= null;
	public static Connection ConnectionDb(){
		String url= "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			conn = (Connection) DriverManager.getConnection(url,"ayman","ayman");	
			if(conn.isValid(30) == true) 	System.out.println("You are Connected to Your Oracle Database");
			else System.out.println("You are not Connected Yet, Try again");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}