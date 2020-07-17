package jdbcOracle;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connO {
	


	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String url= "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = (Connection) DriverManager.getConnection(url,"ayman","ayman");
		if(conn.isValid(30) == true) 	System.out.println("You are Connected");
		else System.out.println("You are not Connected Yet, Try again ");
		Statement stmt = conn.createStatement();
		ResultSet rs= stmt.executeQuery("select empno,ename,job,sal from emp");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+ "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getString(4));
		}
		/*
		PreparedStatement pstmt = conn.prepareStatement("Insert into emp(EMPNO,ENAME,JOB,MGR,SAL,COMM,DEPTNO) values (? , ?, ?, ?, ?, ?, ?)");
		pstmt.setDouble(1, 100);
		pstmt.setString(2, "Ayman");
		pstmt.setString(3, "PHP DEV");
		pstmt.setDouble(4, 7839);
		pstmt.setDouble(5, 9800);
		pstmt.setDouble(6, 0);
		pstmt.setDouble(7, 20);
		pstmt.execute();
		*/
		
		/*
		PreparedStatement pstmt1 = conn.prepareStatement("UPDATE EMP SET sal= ? Where empno=100");
		pstmt1.setDouble(1,12000);
		pstmt1.execute();
		*/
		
		/*
		PreparedStatement pstmt2 = conn.prepareStatement("DELETE FROM EMP where empno=100");
		pstmt2.execute();
		*/
		
		/*
		 create or replace procedure augmenter(unDept in integer, pourcentage in number, count out number) is
		 begin
		 	select sum(sal) * pourcentage / 100 into cout from emp where dept=unDept;
		 	update emp
		 	set sal = sal * (1+pourcentage / 100)
		 	
		 */
		 	
		 	//CallableStatement ctmt- conn.prepareCall("{CALL list_nom_emp}");
		
		 
		
		
		conn.close();
	}

}
