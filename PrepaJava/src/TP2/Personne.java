package TP2;

public class Personne {
	private String prenom;
	private String nom;
	public Personne() {
		this("Ayman","MAKOUKHI");
	}
	public Personne(String prenom,String nom) {
		this.prenom=prenom;
		this.nom=nom;
	}
	public String toString() {
		return "Le nom: " + nom + " Le prenom : " + prenom;
	}
	public boolean equals1(Personne p) {
		if(p.nom == nom && p.prenom == this.prenom ) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
