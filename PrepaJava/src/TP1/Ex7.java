package TP1;

import java.util.Arrays;
import java.util.List;

public class Ex7 {

	public static void main(String[] args) {
		// 1er methode
		System.out.println("*********1ere methode********");
		int [] Tab = {5, 13,-7, 12, 25};
		int [] TabClone = Tab.clone();
		for (int i = 0; i< Tab.length; i++) {
			System.out.println(Tab[i]);
		}
		System.out.println("*********2eme methode********");	
		for (int i2 : Tab) {
			System.out.println(i2);
		}
		// test egalite
		System.out.println("*********Egalite********");
		int [] Tab2 = {5, 13,-7, 12, 25};
		System.out.println(Tab.equals(Tab2));
		// tester les fonctions java
		System.out.println("*********HashCode********");
		System.out.println(Tab.hashCode());
		System.out.println(Tab);
		System.out.println("*********toString********");
		System.out.println(Arrays.toString(Tab));
		Arrays.sort(Tab);
		System.out.println("*********Sort********");
		Arrays.sort(Tab);
		System.out.println(Arrays.toString(Tab));
		System.out.println("*********Binary Search********");
		System.out.println(Arrays.binarySearch(Tab, 12));//Le tableau doit etre trié retourne l'indice de l'element
		System.out.println("*********Fill********");
		Arrays.fill(Tab, 9);//Rendere tout les elements egaux à la valeur donnée
		System.out.println(Arrays.toString(Tab));
		Tab = Arrays.copyOf(TabClone, 6);
		System.out.println(Tab.toString());
		System.out.println(Arrays.toString(Tab));
		Tab = Arrays.copyOfRange(TabClone, 1, 4);
		System.out.println(Arrays.toString(Tab));
		/*
		List l= new ArrayList(3);
		l = Arrays.asList(Tab2);
		System.out.println(Arrays.toString(l.toArray()));
		*/

		
	}

}
