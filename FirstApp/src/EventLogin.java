import java.awt.*;
import java.sql.CallableStatement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class EventLogin implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		String url= "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn;
		try {
			conn = (Connection) DriverManager.getConnection(url,"ayman","ayman");
			if(conn.isValid(30) == true) 	System.out.println("You are Connected to Your Oracle Database");
			else System.out.println("You are not Connected Yet, Try again ");
			/*
			PreparedStatement pstmt = conn.prepareStatement("select * from javaadmin where login= ? and password - ?");
			String login = (LogInFrame.LoginText).getText();
			String pwd = (LogInFrame.PwdText).getText();
			pstmt.setString(1,login);
			pstmt.setString(2,pwd);
			ResultSet rs = pstmt.executeQuery();
			*/
			
			String login = (LogInFrame.LoginText).getText();
			String pwd = (LogInFrame.PwdText).getText();
			String sql = "Select * from javaadmin where login='"+login+"' and password='"+pwd+"'";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				JOptionPane.showMessageDialog(null, "Login Successfully !!");
				new GestionDesEtudiant();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Invalid username or password !!");
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}	
}
