import java.awt.*;
import java.awt.event.*;
public class TestButton {
	public TestButton() {
		Frame f =new Frame("TestBoutton");
		Button b = new Button("Cliquer ici");
		f.add(b);
		f.pack();
		f.setVisible(true);
		b.addActionListener(new MonAction());
	}
	public static void main(String[] args) {
		TestButton test = new TestButton();
	}

}
