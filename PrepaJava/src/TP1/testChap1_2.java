package TP1;

import java.util.Arrays;

public class testChap1_2 {

	public static void main(String[] args) {
	       String str1 = new String("Hello, How are you");
	       String str2 = new String("How");
	       System.out.print("Result of Test1: " );
	       System.out.println(str1.regionMatches(7, str2, 0, 3)); 
	       int[][] notes = { {10, 11, 9},{15, 8}};
	       int [][] tab2 = { {10, 11, 9},{15, 8}};
	       System.out.println(Arrays.deepEquals(notes,tab2)); 
	       System.out.println(Arrays.deepToString(notes)); 
	       System.out.println(str1.substring(0,5));
	       System.out.println(str1.toUpperCase());
	}

}
