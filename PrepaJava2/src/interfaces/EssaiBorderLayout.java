package interfaces;
import java.awt.*;

public class EssaiBorderLayout extends Frame 
{
  private Button b1,b2,b3,b4, b5;
   public EssaiBorderLayout() {
    setLayout(new BorderLayout());
    Panel p = new Panel();
    b1 = new Button ("Nord"); b2 = new Button ("Sud");
    b3 = new Button ("Est"); b4 = new Button ("Ouest");
    b5 = new Button ("Centre");
    
    this.add(b1, BorderLayout.NORTH);
    this.add(b2 , BorderLayout.SOUTH);
    this.add(b3, BorderLayout.EAST); 
    this.add(b4, BorderLayout.WEST);
    this.add(b5, BorderLayout.CENTER);
  }
public static void main (String args []) {
    EssaiBorderLayout essai = new EssaiBorderLayout();
    essai.pack (); essai.setVisible(true) ;                  
  }}
