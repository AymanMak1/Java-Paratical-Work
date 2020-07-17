package awtJdbc;
import java.awt.*;
import java.sql.*;
public class DBConn {
	String url = "";
	static Connection conn = null;
	public static Connection ConnectionDB()
	{
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		try {
			conn = (Connection) DriverManager.getConnection(url,"ayman","ayman");
			if(conn.isValid(30)) System.out.println("You are connected");
			else  System.out.println("You are not connected !! Try again");
		}catch(Exception e){
			e.printStackTrace();
			e.getMessage();
		}
		return conn;
	}	

	public static void main(String [] args) {
		DBConn cnx= new DBConn();
		DBConn.ConnectionDB();
		String sql="select * from personne";
		try {
			PreparedStatement prepareSql = conn.prepareStatement(sql);
			ResultSet rs = prepareSql.executeQuery();
			while(rs.next()) {
				System.out.println("ID :" + rs.getInt(1) + " Nom: " + rs.getString(2) + " Prenom: " + rs.getString(3) );
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
