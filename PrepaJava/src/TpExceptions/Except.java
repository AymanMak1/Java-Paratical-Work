package TpExceptions;
import java.util.Scanner;
class Except{ 
		static int[] tableau = {17, 12, 15, 38, 29, 157, 89, -22, 0, 5}; 
		static int division(int indice, int diviseur) throws ArithmeticException{ 
			if(diviseur == 0)
			{
				throw new ArithmeticException("Vous ne pouvez pas diviser sur 0");
			}
			else {
				return tableau[indice]/diviseur;
			}
		
		} 
	public static void main(String[] args){ 
		boolean test=false;
		do
		{
			try {
				
				int x, y; 
				Scanner r=new Scanner(System.in) ; 
				System.out.println("Entrez l’indice de l’entier à diviser: "); 
				x =r.nextInt(); 
				System.out.println("Entrez le diviseur: "); 
				y = r.nextInt(); 
				System.out.println("Le résultat de la division est: "+ division(x,y) );
				test=false;
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
				test=true;
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
				test=true;
			}catch(NumberFormatException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
				test=true;
			}finally {
				System.out.println("le traitement a ete termine");
			}
			
		}while (test == true);

		} 
}
