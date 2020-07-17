package TP1;

public class TestPersonne {

	public static void main(String[] args) {
		/***************************************Tester la classe Personne ******************************************/
		// pour test toString
		Personne p = new Personne();
		System.out.println(p);
		Personne p1 = new Personne();
		System.out.println(p1);
		// tester le constructeur surcharge
		Personne p3 = new Personne("MAKHOUKHI","Ayman",19);
		System.out.println(p3);
		// tester les variables statiques
		System.out.println("Le numero de personne : " + Personne.nbPersonne);
		System.out.println("Le nom de developpeur" + Personne.nomDev);
		// tester les accesseur statiques
		System.out.println("Le numero de personne : " + Personne.getnbPersonne());
		System.out.println("Le nom de developpeur : " + Personne.getnomDev());
		// tester les accesseur des attributs privees
		Personne p4 = new Personne("EL WAHIDI EL ALAOUI","Nada",20);
		System.out.println(p4.getPrenom());
		p4.setAge(21);
		System.out.println(p4.getAge());
		//.........
		
	}

}
