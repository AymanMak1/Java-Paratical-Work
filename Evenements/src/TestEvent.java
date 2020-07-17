import java.awt.*;
import java.awt.event.*;
public class TestEvent implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		(Fenetre.L).setText((Fenetre.tx).getText());
	}
	

}
