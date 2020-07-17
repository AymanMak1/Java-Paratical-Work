
public class testPersonne {

	public static void main(String[] args) {
		Personne p = new Personne("El wahidi El Alaoui","Nada",20);
		System.out.println(p.getPersonne());
		Personne p2= new Personne();
		p2.setPrenom("Ayman");
		p2.setNom("Makhoukhi");
		p2.setAge((byte)19);
		System.out.println(p2.getPrenom());
		System.out.println(p2.getNom());
		System.out.println(p2.getAge());
		Personne p3= new Personne();
		System.out.println(p3.nombrePersonne());
		Personne p4= new Personne();
		System.out.println(p4);
	}
}