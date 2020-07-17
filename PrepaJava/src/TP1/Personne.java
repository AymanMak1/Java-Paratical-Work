package TP1;

public class Personne {
	private String nom;
	private String prenom;
	private int age;
	public static short nbPersonne=0;
	public static String nomDev="Ayman";
	public Personne(){
		nbPersonne++;
	}
	public Personne(String unNom, String unPrenom,int unAge){
		nom=unNom;
		prenom=unPrenom;
		age=unAge;
		nbPersonne++;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int unAge) {
		age = unAge;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String unPrenom) {
		prenom = unPrenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String unNom) {
		nom = unNom;
	}
	public String getPersonne() {
		return "le nom: " + nom + " le prenom: " + prenom;
	}
	public static short getnbPersonne(){
		return nbPersonne;	
	}
	public static String getnomDev(){
		return nomDev;	
	}
	public String toString() {
		return "C'est le " + nbPersonne +" objet, le dev de cette classe est: " + nomDev + "\nInformations sur l'objet: " + getPersonne() + " Son age est  " + getAge();
		
	}
}
