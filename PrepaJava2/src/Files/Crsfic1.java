package Files;
import java.io.* ; // pour les classes flux
public class Crsfic1
{ 

	public static void main (String args[]) throws IOException{
		int n ;
		FileOutputStream f =new FileOutputStream ("amdev.txt");
		System.out.print ("donnez le nom du fichier a créer : ") ;
		DataOutputStream sortie = new DataOutputStream(f);
		/*
		do { System.out.print ("donnez un entier : ") ;
		Scanner 
		n = Clavier.lireInt() ;
		if (n != 0){ 
			sortie. writeInt (n) ;
			}
		}while (n != 0) ;
		sortie.close () ;
		System.out.println ("*** fin creation fichier ***");
		*/
		}
}
