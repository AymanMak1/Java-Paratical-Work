
public class Personne {
	private String nom;
	private String prenom;
	private byte age;
	public static short nbPersonne = 0;
	public static String nomDev="AM";
	public Personne() {
		Personne.nbPersonne++;
	}
	public Personne(String nom, String prenom,int age){
		this.nom = nom;
		this.prenom= prenom;
		this.age=(byte)age;
		Personne.nbPersonne++;
	}
	public void setPrenom(String prenom){
		this.prenom=prenom;
	}
	public String getPrenom(){
		return this.prenom;
	}
	public void setNom(String nom){
		this.nom=nom;
	}
	public String getNom(){
		return this.nom;
	}
	public void setNomPrenom(String prenom,String nom){
		this.prenom=prenom;
		this.nom=nom;
	}
	public void setAge(int age){
		this.age=(byte)age;
	}
	public byte getAge(){
		return this.age;
	}
	public String nombrePersonne() {
		return "c'est le " + Personne.nbPersonne + " eme objet de la classe Personne";
	}
	public String getPersonne(){
		return Personne.nbPersonne + " " + this.prenom + " " + this.nom + ",Le nom du developpeur:" + Personne.nomDev;
	}

	public String toString() {
		return "Le nom du developpeur: " + Personne.nomDev + " c'est le " + Personne.nbPersonne + "eme objet de la classe Personne";
	}
}