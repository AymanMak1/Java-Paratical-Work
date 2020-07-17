package interfaces;
import java.awt.*;

public class AppliComplexBorderLayout extends Frame {
	public AppliComplexBorderLayout() {
		super("AppliComplexeLayout");
		setLayout(new BorderLayout());
		Panel pnorth = new Panel();
		Button b1= new Button("b1");
		Button b2= new Button("b2");
		Button b3= new Button("b3");
		Button b4= new Button("b4");
		pnorth.add(b1); pnorth.add(b2); 
		pnorth.add(b3); pnorth.add(b4);
		this.add(pnorth,BorderLayout.NORTH);


		Panel pcenter = new Panel();
		Button gr1= new Button("gr1");
		Button gr2= new Button("gr2");
		Button gr3= new Button("gr3");
		Button gr4= new Button("gr4");
		pcenter.setLayout(new GridLayout(2,2));
		pcenter.add(gr1); pcenter.add(gr2);
		pcenter.add(gr3); pcenter.add(gr4);
		this.add(pcenter,BorderLayout.CENTER);

		Panel psouth = new Panel(); 
		Choice ch = new Choice();
		ch.add("ayman");
		ch.add("nada");
		TextField tf = new TextField("un text");
		psouth.setLayout(new FlowLayout());
		psouth.add(ch); psouth.add(tf);   
		this.add(psouth, BorderLayout.SOUTH);
	}
	public static void main(String [] args) {
		 AppliComplexBorderLayout acbl = new AppliComplexBorderLayout ();
		 acbl.show();
		 acbl.pack();
	}
}
