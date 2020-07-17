package awtJdbc;
import java.io.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;




public class Fconsultation extends Frame implements ActionListener, WindowListener{
	FileInputStream fread;
	Scanner in;
	public Fconsultation() throws FileNotFoundException {
		super("Consultation");
		setSize(300,300);
		setVisible(true);
		setLayout(new BorderLayout());
		fread= new FileInputStream("personne.txt");
		in= new Scanner(fread);
		while(in.hasNext()) {
			System.out.println(in.nextDouble() + in.nextLine());
		}
		this.addWindowListener((WindowListener) new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);		
			}

		});
	}
	public static void main(String [] args) throws FileNotFoundException {
		Fconsultation c= new Fconsultation();
		c.show();
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
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
