package TP2;

import java.util.Scanner;

public class Essai {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		String s = "";
		while(s.compareTo("ok") != 0){ 
		s = sc.nextLine(); 
		System.out.println(s); 
		}
		 String s2 = "Thomas Sanchez 16"; 
		 sc = new Scanner(s2); 
		 System.out.println("prenom : " + sc.next() + "\nnom : " + sc.next() + "\nage : " + 
		 sc.nextInt());

		 //Exercice 1:
		 Scanner inp = new Scanner(System.in);
		 String chaine = inp.nextLine();
		 System.out.println(inp.toString());

		 //Exercice 2:
		 Scanner sc2 = new Scanner(System.in);
		 System.out.print("Number 1 : ");
		 int a = sc2.nextInt();
		 System.out.print("Number 2 : ");
		 int b = sc2.nextInt();
		 
			 if(sc2.hasNextInt())
			 {
				 System.out.print("vous avez tapé " + a + " et " + b + " et leur somme est "+ (a+b) );
			 }
			 else
			 {
				 System.out.print("vous avez tapé ? et ?   et leur somme est ?"); 
			 }
			 
		/*
			String q = "sss";
			String q2 = "ddd";
			StringBuilder str= new StringBuilder();
			str.append(q);
			str.append(q2);
			str.delete(2,4);
			System.out.println(str);
		*/
	
	}

}
