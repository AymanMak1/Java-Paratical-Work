package TP1;
import java.util.*; 
import java.util.Scanner; 
public class Ex8 {

	public static void main(String[] args) {
		String [] str ={"youssef", "Ahmed ", "ahmed"};
		System.out.println(str.length);
		for(int i=0; i < str.length; i++) {
			System.out.println(i+ " element : " + str[i].length());
		}

		//Comparer str[0] et str[1] en utilisant  equals , compareTo(),  compareToIgnoreCase() 
		System.out.println(str[0].equals(str[1]));
		System.out.println(str[0].compareTo(str[1]));
		System.out.println(str[0].compareToIgnoreCase(str[1]));
		
		// String builder
		  StringBuilder s = new StringBuilder(); 
		  s.append("Prof"); 
		 // print string 
		  System.out.println("String = " + s); 

		  String t= "Université Med Premier";
		  System.out.println(s.equals(t));
		  
		  
		  
		// Scanner
		  Scanner sc = new Scanner(System.in);
		  System.out.println("\n\nTaper un nombre");
		  boolean build= sc.hasNextInt();
		  System.out.println(build);
	}

}
