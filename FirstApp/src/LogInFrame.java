import java.awt.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LogInFrame extends Frame implements WindowListener, ActionListener {
	
	Connection conn= null;
	PreparedStatement prepared=null;
	ResultSet resultat= null;
	
	static TextField LoginText = new TextField("Enter Login");
	static TextField PwdText= new TextField("Enter password "); 

	    
	public LogInFrame() {
		super("LOGIN");
		
		setLayout(new GridLayout(3,2));
		
		Label LoginLabel= new Label("Login");
		Label PwdLabel = new Label("Password");
		Button valider = new Button("Submit");
		
		add(LoginLabel); add(LoginText);
		add(PwdLabel); add(PwdText);
		add(new Label());
		add(valider);
		setVisible(true);
		//valider.addActionListener(new EventLogin());
		
		// actionListener Login
		valider.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent arg0) {
					conn= DbConn.ConnectionDb();
					
					String login = (LogInFrame.LoginText).getText();
					String pwd = (LogInFrame.PwdText).getText();
					
					String sql = "Select * from javaadmin where login='"+login+"' and password='"+pwd+"'";
					
					try {
						PreparedStatement pstmt = conn.prepareStatement(sql);
						ResultSet rs = pstmt.executeQuery();
						if(rs.next()) {
							JOptionPane.showMessageDialog(null, "Login Successfully !!");
							new GestionDesEtudiant();
							setVisible(false);
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Invalid username or password !!");
						}
					}catch(SQLException e) {
						e.printStackTrace();
					}
			 }
		 });	

		this.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {
			System.exit(0);
		}});	

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		LogInFrame L1 = new LogInFrame();
		L1.show();
		L1.pack();
	}
	
}
