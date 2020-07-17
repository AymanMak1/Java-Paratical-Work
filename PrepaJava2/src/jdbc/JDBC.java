package jdbc;
import java.sql.*;
import javax.swing.JOptionPane;
public class JDBC {
	public static void main (String [] args) {
		String url= "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Connection conn = (Connection) DriverManager.getConnection(url,"ayman","ayman");
			if(conn.isValid(30) == true) 	System.out.println("You are Connected");
			else System.out.println("You are not Connected Yet, Try again ");
			conn.setAutoCommit(true);
			String fetchAll = "select * from javaetudiant";
			PreparedStatement fetchResult= conn.prepareStatement(fetchAll);
			ResultSet rs = 	fetchResult.executeQuery();
			while(rs.next()) {
				System.out.println("ID: " + rs.getInt(1)+ "  Nom: " + rs.getString(2) + "  Prenom:" + rs.getString(3) + "  Filiere:" + rs.getString(4));
			}
			/*
			String updateFiliere= "update javaetudiant set filiere= ? where prenom = ? ";
			PreparedStatement update = conn.prepareStatement(updateFiliere);
			update.setString(1, "Etihad");
			update.setString(2, "Ashraf");		
			update.executeQuery();
			*/
			/*
			String InsertStudent= "insert into javaetudiant values (?,?,?,?)";
			PreparedStatement insert = conn.prepareStatement(InsertStudent);
			insert.setDouble(1, 544565);
			insert.setString(2, "Jenner");	
			insert.setString(3, "Kendall");
			insert.setString(4, "Modele");		
			insert.executeQuery();
			*/
			/*
			String DeleteStudent= "delete from javaetudiant where prenom= ?";
			PreparedStatement insert = conn.prepareStatement(DeleteStudent);
			insert.setString(1,"Safae");	
			insert.executeQuery();
			*/

		} catch (SQLException e) {
			e.getMessage();
			e.printStackTrace();
		}
	}

}


