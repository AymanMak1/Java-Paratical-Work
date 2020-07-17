package TP2;

public class TestObjet {

	public static void main(String[] args) {
		Object O = new Object (); 
		System.out.println( O.toString()) ;// analyser le résultat.
		System.out.println(O); // appel le implicitement toString ().
		Object C = new Object (); 
		System.out.println( C.equals(O)) ;// Expliquer le résultat
		
		Personne P = new Personne ("TITI", "Toto") ;
		System.out.println(P); // analyser le résultat
		Personne R = new Personne ("Mino","Tati") ;
		System.out.print ( R.equals(P)) ;	
	}

}
