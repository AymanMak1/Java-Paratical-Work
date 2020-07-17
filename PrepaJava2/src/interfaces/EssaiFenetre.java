package interfaces;
import java.awt.*;

public class EssaiFenetre
{
  public static void main(String[] args)
  {
    Frame f =new Frame("Ma première fenêtre");
    Button b= new Button("coucou");
    f.add(b);
    f.pack();
    f.show();
  }
}
