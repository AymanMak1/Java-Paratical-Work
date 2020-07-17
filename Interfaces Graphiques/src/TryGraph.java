import java.awt.*;
import java.awt.event.*;
public class TryGraph extends Frame{
	
		public TryGraph() {
			
			super("ApplicationComplexeLayout");
			setLayout(new BorderLayout());
			Panel pnorth = new Panel();
			Button b1 = new Button("B1");Button b2 = new Button("B2");Button b3 = new Button("B3");Button b4 = new Button("B4");
			pnorth.add(b1);pnorth.add(b2);pnorth.add(b3);pnorth.add(b4);
			this.add(pnorth,BorderLayout.NORTH);
			
			Panel pcenter = new Panel();
			pcenter.setLayout(new GridLayout(2,2));
			Button gr1 = new Button("GR1"); 
			Button gr2 = new Button("GR2");
			Button gr3 = new Button("GR3"); 
			Button gr4 = new Button("GR4");
			pcenter.add(gr1);
			pcenter.add(gr2);
			pcenter.add(gr3);
			pcenter.add(gr4);
			this.add(pcenter,BorderLayout.CENTER);
			
			Panel psouth = new Panel();
			psouth.setLayout(new FlowLayout());
			Choice ch = new Choice(); TextField tf = new TextField("text");
			ch.addItem("Ayman");
			ch.addItem("Nada");
			ch.addItemListener( (ItemListener)this);
			psouth.add(ch);psouth.add(tf);
			this.add(psouth,BorderLayout.SOUTH);
			
			this.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
		}
		
		public static void main(String [] args) {
			TryGraph t1 = new TryGraph();
			t1.show();
			t1.pack();
			
		}
		
}
