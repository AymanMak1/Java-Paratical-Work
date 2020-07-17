import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class GestionDesEtudiant extends Frame {
	Connection conn= null;
	PreparedStatement prepared=null;
	ResultSet resultat= null;
	static TextField cneText = new TextField();
	static TextField nomText= new TextField(); 
	static TextField prenomText = new TextField();
	static TextField filiereText= new TextField(); 
		public GestionDesEtudiant() {
			//Design
			super("Gestion des etudiants");
			setLayout(new GridLayout(5,5));
			setSize(500,500);
			setVisible(true);
			Label cneLabel= new Label("Cne");
			Label nomLabel = new Label("Nom");
			Label prenomLabel = new Label("Prenom");
			Label filiereLabel = new Label("Filiere");
			add(cneLabel); add(cneText);
			add(nomLabel); add(nomText);
			add(prenomLabel); add(prenomText);
			add(filiereLabel); add(filiereText);
			
			Panel ButtonsPanel= new Panel();
			TextField MsgAcc= new TextField("Bonjour"+" " + (LogInFrame.LoginText).getText());
			Button B_consulter = new Button("Consulter");
			Button B_ajout = new Button("Ajouter");
			Button B_modification = new Button("Modifier");
			Button B_suppression = new Button("Supprimer");
			ButtonsPanel.add(MsgAcc);  ButtonsPanel.add(B_ajout);
			ButtonsPanel.add(B_suppression);  ButtonsPanel.add(B_modification);
			ButtonsPanel.add(B_consulter);
			this.add( ButtonsPanel,BorderLayout.NORTH);
			
			String[] columns = {"CNE", "NOM", "PRENOM", "FILIERE"};
			JTable tableConsulter= new JTable();
		    JScrollPane scrollPane = new JScrollPane(tableConsulter);
		    tableConsulter.setFillsViewportHeight(true);
		    add(tableConsulter);
		    
			//table functionnalities
			
			B_consulter.addActionListener(new ActionListener(){
				@Override
				 public void actionPerformed(ActionEvent arg0) {
					    try {
					    	 conn= DbConn.ConnectionDb();
					    	 String sql2 = "Select * from javaetudiant";
					    	 PreparedStatement pstmtConsulter = conn.prepareStatement(sql2);
					    	 ResultSet rs =  pstmtConsulter.executeQuery();
					    	 tableConsulter.setModel(DbUtils.resultSetToTableModel(rs));
					    }catch(Exception e) {	    	
					    	JOptionPane.showMessageDialog(null, e.getMessage());
					    }    	
			 }});
			
			 tableConsulter.addMouseListener( new MouseAdapter() {
				 public void mouseClicked(MouseEvent e) {
					 int ligne= tableConsulter.getSelectedRow();
					 String cne= tableConsulter.getValueAt(ligne, 0).toString();
					 JOptionPane.showMessageDialog(null, cne);
					 String sqlDisplayFields="select * from javaetudiant where cne='"+cne+"'";
					 try {
						 prepared = conn.prepareStatement(sqlDisplayFields);
						 resultat = prepared.executeQuery();
						 if(resultat.next()) {
							 cneText.setText(String.valueOf(resultat.getInt("cne")));
							 nomText.setText(resultat.getString("Nom"));
							 prenomText.setText(resultat.getString("Prenom"));
							 filiereText.setText(resultat.getString("Filiere"));
						 }
					 }catch(SQLException e1) {
						 e1.printStackTrace();
					 }
				 }
			 });
			 
			// Button Functionalities
			
			B_ajout.addActionListener(new ActionListener(){
				 public void actionPerformed(ActionEvent arg0) {
						String cne = String.valueOf(cneText.getText());
						String prenom = prenomText.getText();
						String nom = nomText.getText();
						String filiere = filiereText.getText();
						conn= DbConn.ConnectionDb();
						String sqlInsert= "insert into javaetudiant values ( ? , ? , ? , ? )";
						try {
							if(!cne.equals("") || !nom.equals("") || !prenom.equals("") || !filiere.equals(""))
							{
							prepared = conn.prepareStatement(sqlInsert);
							prepared.setString(1, cne);
							prepared.setString(2, nom);
							prepared.setString(3, prenom);
							prepared.setString(4, filiere);
							JOptionPane.showConfirmDialog(null, "Are you sure to add this student ?");
							prepared.execute();
							JOptionPane.showMessageDialog(null,"The student has been added to the database");
							 cneText.setText("");
							 prenomText.setText("");
							 nomText.setText("");
							 filiereText.setText("");
							 
							}else {
								JOptionPane.showMessageDialog(null,"3mar les champs laaah y7fdek");
							}
						}catch (SQLException e) {
							e.getMessage();
						}
						
				 }
			 });
			
			B_modification.addActionListener(new ActionListener(){
				 public void actionPerformed(ActionEvent arg0) {
					 int ligne= tableConsulter.getSelectedRow();
					 String cne= tableConsulter.getValueAt(ligne, 0).toString();
						String cneU = String.valueOf(cneText.getText());
						String prenom = prenomText.getText();
						String nom = nomText.getText();
						String filiere = filiereText.getText();
						conn= DbConn.ConnectionDb();
						 String sqlUpdate="update javaetudiant set nom= ? , prenom = ? , filiere = ? where cne ='"+cne+"'";
						try {
							if(!nom.equals("") || !prenom.equals("") || !filiere.equals(""))
							{
							prepared = conn.prepareStatement(sqlUpdate);
							prepared.setString(1, nom);
							prepared.setString(2, prenom);
							prepared.setString(3, filiere);
							 JOptionPane.showConfirmDialog(null, "Are you sure to modify the informations of this student ?");
							prepared.execute();
							 JOptionPane.showMessageDialog(null,"The student has been modified");
							 cneText.setText("");
							 prenomText.setText("");
							 nomText.setText("");
							 filiereText.setText("");
							 
							}else {
								JOptionPane.showMessageDialog(null,"3mar les champs laaah y7fdek");
							}
						}catch (SQLException e) {
							e.getMessage();
						}
					 
						
				 }
			 });
			
			B_suppression.addActionListener(new ActionListener(){
				@Override
				 public void actionPerformed(ActionEvent arg0) {
					 int ligne= tableConsulter.getSelectedRow();
					 String cne= tableConsulter.getValueAt(ligne, 0).toString();
					 String sqlDelete = "Delete from javaetudiant where cne ='"+cne+"'";
					 try {
						prepared= conn.prepareStatement(sqlDelete);
						JOptionPane.showConfirmDialog(null,"Are you sure you want to remove this student ?");
						prepared.execute();
						 JOptionPane.showMessageDialog(null,"The student has been removed");
						 cneText.setText("");
						 prenomText.setText("");
						 nomText.setText("");
					     filiereText.setText("");
					} catch (SQLException e) {
						
					}
			 }});
			
				this.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {
					System.exit(0);
				}});	
		}
}
