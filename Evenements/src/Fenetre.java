import java.awt.*;
import java.awt.event.*;
public class Fenetre extends Frame implements WindowListener, ActionListener {
	
		public static Button B = new Button("Valider");
		public static Label L = new Label();
		public static TextField tx = new TextField("Saisir ici");
		
		public Fenetre() {
			super("First Frame");
			TestEvent ecouteur = new TestEvent();
			B.addActionListener(ecouteur);
			/*on peut utiliser les classes anonymes(Sans Implementation) 
			 *  B.addActionListener(new addActionListener(){
			 *   public void actionPerformed(ActionEvenet e){
			 *   	(Fenetre.L).setText((Fenetre.tx).getText());
			 *   }
			 *  });
			 * 
			 */
			add(B, BorderLayout.SOUTH);
			add(L, BorderLayout.CENTER);
			add(tx, BorderLayout.NORTH);
			setVisible(true);
			setSize(this.getPreferredSize());
		}
		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
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
		
		/*
		 * L'avantage des adapteur c'est de ne pas faire l'implementation alors il n'est pas obligatoire de definir tous les methodes
		 * les adapteurs permet d'utiliser et definir que les methodes qu'on ont besoin
		 * Exemple:
		 * addWindowListener(new WindowAdapter(){
		 * 		public void windowClosing(){
		 * 			System.exit(0);
		 * }
		 * })
		 */
}
