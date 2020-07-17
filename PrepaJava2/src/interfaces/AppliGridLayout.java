package interfaces;
import java.awt.*; 
public class AppliGridLayout extends Frame 
{
public AppliGridLayout()
 {
  super("AppliGridLayout");	
  this.setLayout(new GridLayout(3,2));
  for (int i = 1; i < 7; i++)
    add(new Button(Integer.toString(i)));
  this.pack();
  this.show();  
 }

public static void main(String args[])
 {
   AppliGridLayout appli = new AppliGridLayout();
 }
}
