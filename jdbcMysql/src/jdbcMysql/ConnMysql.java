package jdbcMysql;
import java.sql.*;



public class ConnMysql {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
			String url = "jdbc:mysql://localhost:3306/academy";
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(url,"root","");
			if(con.isValid(30) == true) System.out.println("You are Connected");
			else System.out.println("You are not Connected Yet, Try again ");
			
			
			/*
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from emp");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close();
			*/  
	
		
			}  

}

