package TP1;

public class Ex5 {
		public static void main(String [] args) {
			final Personne f = new Personne("EL WAHIDI","Nada",20);
			System.out.println(f);
			f.setNom("EL WAHIDI EL ALAOUI");
			System.out.println(f);
			// f = new Personne("EL WAHIDI","Nada",19); on peut initialiser l'objet une autre fois a cause de mot cle final
		}
}
