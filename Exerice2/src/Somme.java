import java.util.Scanner;

public class Somme {
	public static void main (String[] args) {
		System.out.println("Taper n:");
		Scanner nombre1 = new Scanner (System.in);
		int n = nombre1.nextInt();
		System.out.println("Taper m:");
		Scanner nombre2 = new Scanner (System.in);
		int m = nombre2.nextInt();
		double s= n+m;
		System.out.print("Vous avez tapper " + n + " et " + m + " leur somme = " + s) ;
	}
}