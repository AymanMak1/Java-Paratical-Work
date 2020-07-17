package awtJdbc;
import java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;

import javax.swing.JOptionPane;
public class Finsertion extends Frame implements ActionListener{
	protected static final String InsertSql = null;
	FileOutputStream fwrite;
	PrintWriter pw;
	TextField idText = new TextField();
	TextField nomText= new TextField(); 
	TextField prenomText = new TextField();
	Label idLabel= new Label("IDPersonne: ");
	Label nomLabel = new Label("Nom: ");
	Label prenomLabel = new Label("Prenom: ");
	Button insererButton = new Button("inserer");
	Button consulterButton = new Button("consulter");
	public Finsertion(){
		super("InsertionPersonne");
		setSize(300,300);
		//setLayout();
		Panel pDisplay = new Panel();
		pDisplay.setLayout(new GridLayout(4,2));		
		pDisplay.add(idLabel);
		pDisplay.add(idText);
		pDisplay.add(nomLabel);
		pDisplay.add(nomText);
		pDisplay.add(prenomLabel);
		pDisplay.add(prenomText);
		pDisplay.add(new Label());
		pDisplay.add(insererButton);
		this.add(pDisplay,BorderLayout.CENTER);
		this.add(consulterButton,BorderLayout.SOUTH);
		
		
		insererButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {	
				try {
					conn = DBConn.ConnectionDB();	
					String InsertSql = "insert into personne values (?,?,?)";
					conn.setAutoCommit(true);
					if(!(idText.getText().equals("")) && !(nomText.getText().equals("")) && !(prenomText.getText().equals("")) )
					{
						PreparedStatement Insertion = conn.prepareStatement(InsertSql);
						Insertion.setString(1,String.valueOf(idText.getText()));
						Insertion.setString(2, nomText.getText() );
						Insertion.setString(3, prenomText.getText() );	
						fwrite = new FileOutputStream("personne.txt");
						pw = new PrintWriter(fwrite);
						pw.println(String.valueOf(idText.getText())+ " " + nomText.getText() + prenomText.getText() );
						pw.close();
						JOptionPane.showConfirmDialog(null, "Are you sure to add this student ?");
						Insertion.execute();
						JOptionPane.showMessageDialog(null,"The student has been added to the database");
						idText.setText("");
						nomText.setText("");
						prenomText.setText("");
						
					}else {
						System.out.println("remplir les champs");
						JOptionPane.showMessageDialog(null,"remplir les champs vide");
					}
				} catch (SQLException | FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		consulterButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					new Fconsultation();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}

			
		});
		this.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {
			System.exit(0);
		}});
		
	}
	public static void main(String [] args) {
		Finsertion fi= new Finsertion();
		fi.show();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
