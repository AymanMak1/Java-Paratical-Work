import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		final double MIN;
		final double MAX; 
		System.out.println("Taper Min:");
		Scanner sc = new Scanner (System.in);
		MIN = sc.nextDouble();
		MAX = MIN + 10;
		System.out.println("MAX = " + (double)MAX);
		
	}
}
