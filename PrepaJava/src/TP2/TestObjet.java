package TP2;

public class TestObjet {

	public static void main(String[] args) {
		Object O = new Object (); 
		System.out.println( O.toString()) ;// analyser le r�sultat.
		System.out.println(O); // appel le implicitement toString ().
		Object C = new Object (); 
		System.out.println( C.equals(O)) ;// Expliquer le r�sultat
		
		Personne P = new Personne ("TITI", "Toto") ;
		System.out.println(P); // analyser le r�sultat
		Personne R = new Personne ("Mino","Tati") ;
		System.out.print ( R.equals(P)) ;	
	}

}
